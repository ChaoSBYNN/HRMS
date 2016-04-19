package com.zxc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zxc.dao.MissionDao;
import com.zxc.entity.Mission;

@Service
public class MissionService {
	
private MissionDao MissionDao;
	
	public Mission selectMission(Mission Mission){
		MissionDao = new MissionDao();
		return MissionDao.selectMission(Mission);
	}

	public Integer insertMission(Mission Mission){
		MissionDao = new MissionDao();
		return MissionDao.insertMission(Mission);
	}
	
	public List<Mission> selectMissions(){
		MissionDao = new MissionDao();
		return MissionDao.selectMissions();
	}
	
	public Integer updateMission(Mission Mission){
		MissionDao = new MissionDao();
		return MissionDao.updateMission(Mission);
	}
	
	public Integer deleteMission(Mission Mission){
		MissionDao = new MissionDao();
		return MissionDao.deleteMission(Mission);
	}
}
