package com.zxc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zxc.entity.User;
import com.zxc.service.UserService;


@Controller
@RequestMapping(value="/CUser")
public class UserController {
	

	private UserService userService;
	
	@RequestMapping(value="/signin")
	public ModelAndView userSignin(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView(); 
		String flag = "/emp_system/JUser/index";
		User user = new User();
		user.setUsername(request.getParameter("username"));
		user.setPassword(request.getParameter("password"));
		userService = new UserService();
		user = userService.selectUser(user);
		request.getSession().setAttribute("user", user);
		
		modelAndView.setViewName(flag);
		modelAndView.addObject("user", user);
		return modelAndView;
	}
	
	@RequestMapping(value="/signup")
	public ModelAndView userSignup(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView(); 
		String flag = "/emp_system/JUser/signin";
		User user = new User();
		user.setUsername(request.getParameter("username"));
		user.setPassword(request.getParameter("password"));
		userService = new UserService();
		Integer count = userService.insertUser(user);
		
//		flag = count==1?"success":"error";
		modelAndView.setViewName(flag);
		modelAndView.addObject("user", user);
		modelAndView.addObject("count", count);
		return modelAndView;
	}
	
}
