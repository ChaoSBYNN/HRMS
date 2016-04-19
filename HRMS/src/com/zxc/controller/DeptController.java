package com.zxc.controller;


import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zxc.entity.Dept;
import com.zxc.service.DeptService;

@Controller
@RequestMapping(value="/CDept")
public class DeptController extends BaseController {
	
	DeptService ds;
	
	@RequestMapping(value = "/selectDept")
	public ModelAndView selectEmp(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		DeptService ds = new DeptService();
		ArrayList<Dept> deptList = (ArrayList<Dept>)ds.selectDepts();
		modelAndView.addObject("deptList", deptList);
		modelAndView.setViewName("/emp_system/JDept/ListDept");
		return modelAndView;
	}

	@RequestMapping(value = "/intoDept")
	public ModelAndView intoDept(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/emp_system/JDept/insertOrUpdateDept");
		return modelAndView;
	}
	
	@RequestMapping(value = "/insertDept")
	public ModelAndView insertDept(HttpServletRequest request) {
		DeptService ds = new DeptService();
		ModelAndView modelAndView = new ModelAndView();
		Dept dept = new Dept();
		dept.setDeptName(getRequestValus(request, "deptName"));
		dept.setFatherId(Integer.parseInt(getRequestValus(request, "fatherId")));
		ds.insertDept(dept); 
		modelAndView.setViewName("redirect:/CDept/selectDept");
		return modelAndView;
	}
}
