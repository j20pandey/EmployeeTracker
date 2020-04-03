//package com.one.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.one.model.User;
//import com.one.repository.UserRepository;
//
//@Controller
//public class UserController {
//
//	@Autowired
//	UserRepository userRepo;
//
//	// Mapping
//	@RequestMapping("id")
//	public String Home() {
//		return "CreateUser";
//		// return "DataTable";
//	}
//	
//	@RequestMapping("login")
//	public String login() {
//		return "";
//	}
//
//	@RequestMapping("/AddUser")
//	public String userAdd(User log) {
//		System.out.println("Data Adding");
//		userRepo.save(log);
//		
//		return "CreateUser";
//	}
//
//}
