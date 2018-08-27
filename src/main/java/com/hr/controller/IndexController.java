package com.hr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/")
public class IndexController {

//	跳转用户登录页面
	@RequestMapping("/login")
	public String login() {
		
		return "login";
	}
	
//	跳转用户注册页面
	@RequestMapping("/register")
	public String register() {
		
		return "register";
	}
}
