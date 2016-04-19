package com.zxc.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zxc.entity.Resume;
import com.zxc.service.ResumeService;

//通过@Controller注解标识UserController这个类是一个控制器
@Controller
@RequestMapping(value="/CResume")
public class ResumeController extends BaseController {
	
	ResumeService as = new ResumeService();
	
	@RequestMapping(value="/selectResume",method=RequestMethod.GET)
	public ModelAndView selectResume(){
		ModelAndView modelAndView = new ModelAndView();
		ArrayList<Resume> ResumeList = (ArrayList<Resume>)as.selectResumes();
		modelAndView.addObject("ResumeList", ResumeList);
		modelAndView.setViewName("/emp_system/JResume/Resume");
		return modelAndView;
	}
	
	@RequestMapping(value="/insertResume",method=RequestMethod.GET)
	public ModelAndView insertResume(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView();
		Resume ac = new Resume();
		ac.setResumePath(getRequestValus(request, "ResumePath"));
		as.insertResume(ac);
		modelAndView.setViewName("/CResume/selectResume");
		return modelAndView;
	}
	
	@RequestMapping(value="/deleteResume",method=RequestMethod.GET)
	public ModelAndView deleteResume(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView();
		Resume ac = new Resume();
		ac.setResumeId(Integer.parseInt(getRequestValus(request, "ResumeId")));
		as.deleteResume(ac);
		modelAndView.setViewName("/CResume/selectResume");
		return modelAndView;
	}
}
