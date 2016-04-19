package com.zxc.mapper;

import java.util.List;

import com.zxc.entity.Mission;

public interface MissionMapper {

	public Mission selectMission(Mission mission);

	public Integer insertMission(Mission mission);
	
	public List<Mission> selectMissions();
	
	public Integer updateMission(Mission mission);
	
	public Integer deleteMission(Mission mission);

	
}
