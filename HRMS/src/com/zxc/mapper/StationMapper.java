package com.zxc.mapper;

import java.util.List;

import com.zxc.entity.Station;

public interface StationMapper {

	public Station selectStation(Station station);
	
	public List<Station> selectStationByFatherId(Station station);

	public Integer insertStation(Station station);
	
	public List<Station> selectStations();
	
	public Integer updateStation(Station station);
	
	public Integer deleteStation(Station station);

	
}
