package com.zxc.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zxc.entity.Mission;
import com.zxc.entity.Station;
import com.zxc.service.MissionService;

//通过@Controller注解标识UserController这个类是一个控制器
@Controller
@RequestMapping(value="/CMission")
public class MissionController extends BaseController {
	
	MissionService as = new MissionService();
	
	@RequestMapping(value="/selectMission")
	public ModelAndView selectMission(){
		ModelAndView modelAndView = new ModelAndView();
		ArrayList<Mission> MissionList = (ArrayList<Mission>)as.selectMissions();
		modelAndView.addObject("missionList", MissionList);
		modelAndView.setViewName("/emp_system/JMission/ListMission");
		return modelAndView;
	}
	
	@RequestMapping(value="/intoMission")
	public ModelAndView intoStation(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/emp_system/JMission/insertOrUpdateMisson");
		return modelAndView;
	}
	
	@RequestMapping(value="/insertMission")
	public ModelAndView insertMission(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView();
		Mission mission = new Mission();
		mission.setMissionName(getRequestValus(request, "missionName"));
		mission.setIssuerId(Integer.parseInt(getRequestValus(request, "issuerId")));
		mission.setMissionInfo(getRequestValus(request, "missionInfo"));
		mission.setIssuedate(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date()));
		as.insertMission(mission);
		modelAndView.setViewName("redirect:/CMission/selectMission");
		return modelAndView;
	}
	
	@RequestMapping(value="/deleteMission")
	public ModelAndView deleteMission(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView();
		Mission mission = new Mission();
		mission.setMissionId(Integer.parseInt(getRequestValus(request, "MissionId")));
		as.deleteMission(mission);
		modelAndView.setViewName("redirect:/CMission/selectMission");
		return modelAndView;
	}
}
