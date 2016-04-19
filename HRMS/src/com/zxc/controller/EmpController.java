package com.zxc.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zxc.entity.Emp;
import com.zxc.entity.EmpBaseInfo;
import com.zxc.entity.EmpContactInfo;
import com.zxc.entity.EmpEducationInfo;
import com.zxc.entity.EmpWorkInfo;
import com.zxc.service.EmpBaseInfoService;
import com.zxc.service.EmpContactInfoService;
import com.zxc.service.EmpEducationInfoService;
import com.zxc.service.EmpOfficeInfoService;
import com.zxc.service.EmpService;
import com.zxc.service.EmpWorkInfoService;

//通过@Controller注解标识UserController这个类是一个控制器
@Controller
@RequestMapping(value = "/CEmp")
public class EmpController extends BaseController {
	
	EmpService es = new EmpService();
	EmpBaseInfoService ebis = new EmpBaseInfoService();
	EmpContactInfoService ecis = new EmpContactInfoService();
	EmpEducationInfoService eeis = new EmpEducationInfoService();
	EmpOfficeInfoService eois = new EmpOfficeInfoService();
	EmpWorkInfoService ewis = new EmpWorkInfoService();
	
	@RequestMapping(value = "/selectEmp")
	public ModelAndView selectEmp(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		Integer empId = Integer.parseInt(getRequestValus(request, "empId"));
		Emp emp = new Emp();
		emp.setEmpId(empId);
		modelAndView.addObject("emp", emp);
		modelAndView.setViewName("/emp_system/JEmp/Emp");
		return modelAndView;
	}
	
	@RequestMapping(value = "/insertEmp")
	public ModelAndView insertEmp(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		Integer userId = Integer.parseInt(getRequestValus(request, "userId"));
		Emp emp = new Emp();
		emp.setUserId(userId);
		es.insertEmp(emp);
		modelAndView.setViewName("/emp_system/JEmp/EmpBaseInfo");
		modelAndView.addObject("emp", emp);
		return modelAndView;
	}

	@RequestMapping(value = "/intoEmpBaseInfo")
	public ModelAndView intoEmpBaseInfo(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		Integer empId = Integer.parseInt(getRequestValus(request, "empId"));
		Emp emp = new Emp();
		emp.setEmpId(empId);
		modelAndView.setViewName("/emp_system/JEmp/EmpBaseInfo");
		modelAndView.addObject("emp", emp);
		return modelAndView;
	}
	
	@RequestMapping(value = "/insertEmpBaseInfo")
	public ModelAndView insertEmpBaseInfo(HttpServletRequest request) {
		ebis = new EmpBaseInfoService();
		ModelAndView modelAndView = new ModelAndView();
		Integer empId = Integer.parseInt(getRequestValus(request, "empId"));
		EmpBaseInfo ebi = new EmpBaseInfo();
		ebi.setEmpId(empId);
		ebi.setEmpAge(Integer.parseInt(getRequestValus(request, "empAge")));
		ebi.setEmpEducation(getRequestValus(request, "empEducation"));
		ebi.setEmpName(getRequestValus(request, "empName"));
		ebi.setEmpSex(request.getParameter("empName").equals("1")?true:false);
		ebi.setIdCard(Integer.parseInt(getRequestValus(request, "idCard")));
		ebi.setStationId(45);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		try {
			ebi.setEmpBirthday(sdf.parse(getRequestValus(request, "empBirthday")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		ebis.insertEmpBaseInfo(ebi);
		Emp emp = new Emp();
		emp.setEmpId(empId);
		modelAndView.addObject("emp", emp);
		modelAndView.setViewName("/emp_system/JEmp/EmpContactInfo");
		return modelAndView;
	}

	@RequestMapping(value = "/insertEmpContactInfo")
	public ModelAndView insertEmpContactInfo(HttpServletRequest request,EmpContactInfo e) {
		ModelAndView modelAndView = new ModelAndView();
		EmpContactInfo eci = new EmpContactInfo();
		Integer empId = Integer.parseInt(getRequestValus(request, "empId"));
		eci.setEmpAddress(getRequestValus(request, "empAddress"));
		eci.setEmpEmail(getRequestValus(request, "empEmail"));
		eci.setEmpId(empId);
		eci.setHomePhone(Integer.parseInt(getRequestValus(request, "homePhone")));
		eci.setMobilePhone(Integer.parseInt(getRequestValus(request, "mobilePhone")));
		eci.setOfficePhone(Integer.parseInt(getRequestValus(request, "officePhone")));
		ecis.insertEmpContactInfo(eci);
		Emp emp = new Emp();
		emp.setEmpId(empId);
		modelAndView.addObject("emp", emp);
		modelAndView.setViewName("/emp_system/JEmp/EmpEducationInfo");
		return modelAndView;
	}

	@RequestMapping(value = "/insertEmpEducationInfo")
	public ModelAndView insertEmpEducationInfo(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		Integer empId = Integer.parseInt(getRequestValus(request, "empId"));
		EmpEducationInfo eei = new EmpEducationInfo();
		eei.setEmpId(empId);
		eei.setSchoolName(getRequestValus(request, "schoolName"));
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		try {
			eei.setEnterdate(sdf.parse(getRequestValus(request, "enterdate")));
			eei.setLeavedate(sdf.parse(getRequestValus(request, "leavedate")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		eeis.insertEmpEducationInfo(eei);
		Emp emp = new Emp();
		emp.setEmpId(empId);
		modelAndView.addObject("emp", emp);
		modelAndView.setViewName("/emp_system/JEmp/EmpWorkInfo");
		return modelAndView;
	}
	
	@RequestMapping(value = "/insertEmpWorkInfo")
	public ModelAndView insertEmpWorkInfo(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		Integer empId = Integer.parseInt(getRequestValus(request, "empId"));
		EmpWorkInfo ewi = new EmpWorkInfo();
		ewi.setCompanyName(getRequestValus(request, "companyName"));
		ewi.setDuty(getRequestValus(request, "duty"));
		ewi.setExstation(getRequestValus(request, "exstation"));
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		try {
			ewi.setEnterdate(sdf.parse(getRequestValus(request, "enterdate")));
			ewi.setLeavedate(sdf.parse(getRequestValus(request, "leavedate")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Emp emp = new Emp();
		emp.setEmpId(empId);
		modelAndView.addObject("emp", emp);
		modelAndView.setViewName("/emp_system/JEmp/Emp");
		return modelAndView;
	}
	
	

}
