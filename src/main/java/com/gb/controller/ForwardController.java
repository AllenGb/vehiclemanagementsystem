package com.gb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value="api/forward")
public class ForwardController{
	//跳转专用
	@RequestMapping(value="go")
	public String seturl(String url){
		return "page/"+url ;
	}
}
