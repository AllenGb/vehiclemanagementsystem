package com.gb.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;



public class FileUtil  {
	
	/*//相对路径配置
	@Autowired
	private HttpServletRequest request;
	//通过spring注解传入参数失败，无法通过request获取根目录
	private String path="";
	public void setPath(String path) {
		this.path = path;
	}
	String filepath=request.getSession().getServletContext().getRealPath("/")+this.path;
	*/
	
	//定义绝对路径
	private static final String filepath ="D:\\apache-tomcat-6.0.41-windows-x64\\apache-tomcat-6.0.41\\webapps\\CarManager_LHZ\\upload\\";
	
	
	/**
	 * 
	 * @param fileName 文件的后缀名带小点 .jpg.png
	 * @return 新的文件名
	 */
	public String createFileName(String fileName){
		//取后缀名
		String p_n=fileName.substring(fileName.indexOf("."));
		
		//构建新文件名 =pic_当前时间毫秒值.后缀
		String newName="f_"+System.currentTimeMillis()+p_n;
		
		
		return newName;
	}
	
	public boolean uploadFile(String fileName, MultipartFile file){
		boolean res=true;
		
		try {
			//上传路径对象
			File fileDir=new File(filepath);
			
			if(!fileDir.exists()){
				fileDir.mkdirs();
			}
			
			//上传目标文件对象
			File f =new File(fileDir,fileName);
			
			//转存文件
			file.transferTo(f);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
	/***
	 * 
	 * @param fileName 待删除文件名
	 * @return 成功与否
	 */
	public boolean delImg(String fileName){
		boolean r=true;
		try {
			//构建待删除的文件对象
			File f =new File(filepath+fileName);	
			
			if(f.exists()){
				f.delete();
			}
			
		} catch (Exception e) {
			r=false;
		}
		
		return r;
	}
}
