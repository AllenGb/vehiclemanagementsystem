package com.gb.util;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileTool {
	public static void main(String[] args) {
		//测试新文件名
		System.out.println(createFileName("haha.jpg"));
		
		
		/*try {
			//源文件
			File f1=new File("c:\\abc\\a.txt");
			FileInputStream fin =new FileInputStream(f1);
			
			//目标文件
			File fdir=new File("d:\\haha\\");
			File f2=new File(fdir,"b.txt");
			FileOutputStream fout=new FileOutputStream(f2);
			
			int len=0;
			byte[] b=new byte[1024];
			
			while((len=fin.read(b)) !=-1) {
				fout.write(b, 0, len);
			}
			
			fin.close();
			fout.close();			
			
		} catch (Exception e) {
			// TODO: handle exception
		}*/
		
		
		
		
	}
	
	//上传路径
	public static String path="upload";
	
	/***
	 * 生成新的文件名
	 * @param fileName 待上传文件名
	 * @return 新的文件名，有当前毫秒值构成
	 */
	public static String createFileName(String fileName){
		//取后缀名
		String p_n=fileName.substring(fileName.indexOf("."));
		
		//构建新文件名 =pic_当前时间毫秒值.后缀
		String newName="f_"+System.currentTimeMillis()+p_n;
		
		//缺点文件名太长
		//String newName=UUID.randomUUID().toString().replace("-", "")+p_n;
		
		return newName;
	}
	
	/***
	 * 上传文件
	 * @param request
	 * @param file 待上传文件
	 * @param fileName 文件名
	 * @return 成功与否
	 */
	public static boolean saveFile(HttpServletRequest request,MultipartFile file,String fileName){
		
		if(!file.isEmpty()){
			try {
				//上传路径对象
				File fileDir=new File(request.getServletContext().getRealPath("/")+path);
				//System.out.println("--->"+fileDir.getAbsolutePath());
				
				//文件夹不存在就创建
				if(!fileDir.exists()){
					fileDir.mkdirs();
				}
				
				//上传目标文件对象
				File f =new File(fileDir,fileName);
				
				//复制文件
				file.transferTo(f);
				
				return true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return false;
	}
	
	/***
	 * 普通方式下载文件
	 * @param request
	 * @param response
	 * @param fileName 待下载文件名
	 */
	public static void dowloadFile(HttpServletRequest request,HttpServletResponse response,String fileName){
		try {
			//得到存储文件的目录对象
			File fileDir=new File(request.getServletContext().getRealPath("/")+path);
			//得到待下载文件对象
			File f =new File(fileDir,fileName);
			//包装输入流
			InputStream in =new FileInputStream(f);
			
			//响应对象重置
			response.reset();
			//设置响应格式
			response.setContentType("bin");
			//设置响应头
			response.addHeader("Content-Disposition", "attachment;filename=\""+fileName+"\"");
			
			//得到输出流
			OutputStream out=response.getOutputStream();
			
			int len=0;
			byte[] b=new byte[1024];
			
			while((len=in.read(b))!=-1){
				out.write(b,0,len);
			}
			
			in.close();
			out.close();
			
		} catch (Exception e) {
			
		}
		
	}
	
	/***
	 * spring提供的下载方式
	 * @param request
	 * @param fileName 待下载文件名
	 * @return ResponseEntity<byte[]>
	 */
	public static ResponseEntity<byte[]> dowloadFileSpring(HttpServletRequest request,String fileName){
		try {
			File fileDir=new File(request.getServletContext().getRealPath("/")+path);
			File f =new File(fileDir,fileName);
			
			HttpHeaders headers = new HttpHeaders(); 
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			headers.setContentDispositionFormData("attachment", fileName); 
			
			ResponseEntity<byte[]> re = new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(f), headers, HttpStatus.CREATED);
			
			return re;
		} catch (Exception e) {
			
		}
		
		return null;
		
	}


	
}
