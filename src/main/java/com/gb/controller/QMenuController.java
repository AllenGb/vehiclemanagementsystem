package com.gb.controller;

import com.gb.util.JSONTool;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


@Api("QMeunController丨用户动态菜单的生成")
//@CrossOrigin(origins = "*",maxAge = 3600)//跨域访问设置
@Controller("QMeunController")
@RequestMapping(value="api/qmenu",produces="text/html;charset=utf-8")//,produces="text/html;charset=utf-8"
public class  QMenuController {

	@Autowired
	private com.gb.Service.QMenuService QMenuService;
	
	/*产生菜单*/
	@ApiOperation(value = "菜单",notes = "得到session中存入的Q_Users信息苏得到菜单")
	@ApiImplicitParam(name = "cookie",value = "String",required = true,dataType = "Q_Users",paramType = "path")
	@RequestMapping("Menu")
	@ResponseBody
	public String findMenu(HttpServletRequest request){


		//System.out.println(request.getHeader("cookie"));

		return JSONTool.writeJson(QMenuService.findMenu("admin"));//(Q_Users)session.getAttribute("loginQUsers")
	}


}
