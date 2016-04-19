package com.zxc.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.zxc.entity.Station;
import com.zxc.mapper.StationMapper;
import com.zxc.util.MyBatisUtil;

public class StationDao {

	static SqlSessionFactory sqlSessionFactory = null;

	static {
		sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
	}

	public Station selectStation(Station station) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			StationMapper StationMapper = sqlSession.getMapper(StationMapper.class);
			station = StationMapper.selectStation(station);
		} finally {
			sqlSession.close();
		}
		return station;
	}

	public List<Station> selectStations() {
		SqlSession session = sqlSessionFactory.openSession();
		List<Station> stations = null;
		try {
			StationMapper mapper = session.getMapper(StationMapper.class);
			stations = (List<Station>) mapper.selectStations();
		} finally {
			session.close();
		}
		return stations;
	}
	
	public Integer insertStation(Station station){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            StationMapper mapper = session.getMapper(StationMapper.class);  
            count = mapper.insertStation(station);  
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
	public Integer updateStation(Station station){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            StationMapper mapper = session.getMapper(StationMapper.class);  
            count = mapper.updateStation(station);  
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
	public Integer deleteStation(Station station){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            StationMapper mapper = session.getMapper(StationMapper.class);  
            count = mapper.deleteStation(station);  
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
	public static void main(String[] args) {
		StationDao sd = new StationDao();
		for(Station station : sd.selectStations()){
			System.out.println(station.getStationName());
		}
	}
	
}