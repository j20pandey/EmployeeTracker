package com.one.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseController {
	
	@RequestMapping("/login")
	public String logIn() {
	
		return "LogIn";
	}
	
//	@RequestMapping("/")
//	public String home() {
//		return "index";
//	}

	
	@RequestMapping("/logoutSuc")
	public String logout() {
		return "LogOut";
	}
	
	@RequestMapping("user")
	@ResponseBody
	public Principal user(Principal principal) {
		return principal;
	}


	

}
