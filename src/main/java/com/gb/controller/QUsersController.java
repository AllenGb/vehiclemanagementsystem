package com.gb.controller;


import com.gb.Service.QUsersService;
import com.gb.beans.POJO.Q_Users;
import com.gb.beans.VO.ResultVO;
import com.gb.util.JSONTool;
import com.gb.util.MD5Tool;
import com.gb.util.SysStr;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
//@ApiOperation(value = “接口说明”, httpMethod = “接口请求方式”,
// response = “接口返回参数类型”, notes = “接口发布说明”；其他参数可参考源码；

/* @ApiImplicitParam：用在@ApiImplicitParams注解中，指定一个请求参数的各个方面
		name：参数名
		value：参数的汉字说明、解释
		required：参数是否必须传
		paramType：参数放在哪个地方
		· header --> 请求参数的获取：@RequestHeader
            · query --> 请求参数的获取：@RequestParam
            · path（用于restful接口）--> 请求参数的获取：@PathVariable
            · body（不常用）
			· form（不常用）
			dataType：参数类型，默认String，其它值dataType="Integer"
			defaultValue：参数的默认值
*/


@Api("QUsersController丨用户登录和安全退出")
//@CrossOrigin(origins = "*",maxAge = 3600)//跨域访问设置
@Controller("QUsersController")
@RequestMapping("api/qusers")
public class QUsersController {
	@Autowired
	private QUsersService QUsersService;


	/*新增*/
	@ApiOperation(value = "新增",notes = "新增qusers信息，rvo默认failse")
	@ApiImplicitParam(name = "add",value = "Q_Users的实体",required = true,dataType = "String",paramType="path")
	@RequestMapping("add")
	@ResponseBody
	public String add(Q_Users qusers) {
		//初始化回传对象
		ResultVO rvo =new ResultVO(SysStr.addfail);

		if(QUsersService.add(qusers)) {
			rvo.setSuccess(true);
			rvo.setMsg(SysStr.addsuccess);
		}
		return JSONTool.writeJson(rvo);
	}



	/*查询分页*/
	@ApiOperation(value = "查询分页",notes = "分页查询Q_Users在数据库中的信息")
	@ApiImplicitParam(name = "findByPage",value = "Q_Users的实体",required = true,dataType = "String",paramType="path")
	@RequestMapping("findByPage")
	@ResponseBody
	public String findByPage(Q_Users qusers) {
		return JSONTool.writeJson(QUsersService.findByPage(qusers));
	}



	/*登录*/
	@ApiOperation(value = "登录",notes = "登录正确进入index界面，错误返回login界面")
	@ApiImplicitParam(name = "user",value = "用户实体",required = true,dataType = "String、session",paramType="path")
	@RequestMapping("login")
	@ResponseBody
	public String login(Q_Users quser, HttpSession session) {

		//MD5密码加密
		quser.setLpass(MD5Tool.md5Encode(quser.getLpass()));
		//调用biz登录业务
		Q_Users quData=QUsersService.login(quser);
		if(quData !=null) {
			//登录信息放入session
			session.setAttribute("loginQUsers", quData);
			System.out.println("测试输出账户"+quData.getLname());
			System.out.println("测试输出密码"+quData.getLpass());

			return "index";
		}

		return "login";
	}


	/*安全退出*/
	@ApiOperation(value = "安全退出",notes = "清空session内容，并返回login界面")
	@ApiImplicitParam(name = "exit",value = "session会话中的user信息",required = true,dataType = "session",paramType="path")
	@RequestMapping("exit")
	public String exit(HttpSession session) {
		//清空session内容
		session.invalidate();

	return "login";
	}




}
