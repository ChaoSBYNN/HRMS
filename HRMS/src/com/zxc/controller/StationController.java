package com.zxc.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zxc.entity.Dept;
import com.zxc.entity.Station;
import com.zxc.service.DeptService;
import com.zxc.service.StationService;

//通过@Controller注解标识UserController这个类是一个控制器
@Controller
@RequestMapping(value="/CStation")
public class StationController extends BaseController{
	
	StationService as = new StationService();
	
	@RequestMapping(value="/selectStation")
	public ModelAndView selectStation(){
		ModelAndView modelAndView = new ModelAndView();
		ArrayList<Station> stationList = (ArrayList<Station>)as.selectStations();
		modelAndView.addObject("stationList", stationList);
		modelAndView.setViewName("/emp_system/JStation/ListStation");
		return modelAndView;
	}
	
	@RequestMapping(value="/intoStation")
	public ModelAndView intoStation(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/emp_system/JStation/insertOrUpdateStation");
		return modelAndView;
	}
	
	@RequestMapping(value="/insertStation")
	public ModelAndView insertStation(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView();
		Station station = new Station();
		station.setStationName(getRequestValus(request, "stationName"));
		station.setDeptId(Integer.parseInt(getRequestValus(request, "deptId")));
		station.setFatherId(Integer.parseInt(getRequestValus(request, "fatherId")));
		as.insertStation(station);
		modelAndView.setViewName("redirect:/CStation/selectStation");
		return modelAndView;
	}
	
	
	@RequestMapping(value="/deleteStation")
	public ModelAndView deleteStation(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView();
		Station station = new Station();
		station.setStationId(Integer.parseInt(getRequestValus(request, "StationId")));
		as.deleteStation(station);
		modelAndView.setViewName("redirect:/CStation/selectStation");
		return modelAndView;
	}
}
	