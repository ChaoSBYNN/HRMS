package com.zxc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zxc.entity.User;
import com.zxc.service.UserService;

@Controller
@RequestMapping(value="/CTest")
public class TestController {
	
	@RequestMapping(value="/test")
	public ModelAndView userSignin(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView(); 
		String flag = "/emp_system/JFrame/main";
		modelAndView.setViewName(flag);
		return modelAndView;
	}
	
}
