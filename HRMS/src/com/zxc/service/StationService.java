package com.zxc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zxc.dao.StationDao;
import com.zxc.entity.Station;

@Service
public class StationService {
	
private StationDao StationDao;
	
	public Station selectStation(Station Station){
		StationDao = new StationDao();
		return StationDao.selectStation(Station);
	}

	public Integer insertStation(Station Station){
		StationDao = new StationDao();
		return StationDao.insertStation(Station);
	}
	
	public List<Station> selectStations(){
		StationDao = new StationDao();
		return StationDao.selectStations();
	}
	
	public Integer updateStation(Station Station){
		StationDao = new StationDao();
		return StationDao.updateStation(Station);
	}
	
	public Integer deleteStation(Station Station){
		StationDao = new StationDao();
		return StationDao.deleteStation(Station);
	}
}
