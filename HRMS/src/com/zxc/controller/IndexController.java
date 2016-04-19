package com.zxc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zxc.entity.User;
import com.zxc.service.UserService;
import com.zxc.util.StringUtils;

@Controller
@RequestMapping(value="/CIndex")
public class IndexController {
	

	UserService us;
	
	@RequestMapping(value="/signin")
	public ModelAndView  doSignin(HttpServletRequest request){
		
		ModelAndView modelAndView = new ModelAndView(); 
		
		String flag = "/emp_system/JUser/signin";
		
		modelAndView.setViewName(flag);
		
		return modelAndView;
	
	}
	
	@RequestMapping(value="/signup")
	public ModelAndView  doSignup(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView(); 
		String flag = "/emp_system/JUser/signup";
		modelAndView.setViewName(flag);
		return modelAndView;
	
	}
	
}
