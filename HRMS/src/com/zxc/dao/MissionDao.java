package com.zxc.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.zxc.entity.Mission;
import com.zxc.mapper.MissionMapper;
import com.zxc.util.MyBatisUtil;

public class MissionDao {

	static SqlSessionFactory sqlSessionFactory = null;

	static {
		sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
	}

	public Mission selectMission(Mission Mission) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			MissionMapper MissionMapper = sqlSession.getMapper(MissionMapper.class);
			Mission = MissionMapper.selectMission(Mission);
		} finally {
			sqlSession.close();
		}
		return Mission;
	}

	public List<Mission> selectMissions() {
		SqlSession session = sqlSessionFactory.openSession();
		List<Mission> Missions = null;
		try {
			MissionMapper mapper = session.getMapper(MissionMapper.class);
			Missions = (List<Mission>) mapper.selectMissions();
			for (Mission Mission : Missions) {
				System.out.println(Mission.getMissionName());
			}
		} finally {
			session.close();
		}
		return Missions;
	}
	
	public Integer insertMission(Mission Mission){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            MissionMapper mapper = session.getMapper(MissionMapper.class);  
            count = mapper.insertMission(Mission);  
            //*
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
	public Integer updateMission(Mission Mission){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            MissionMapper mapper = session.getMapper(MissionMapper.class);  
            count = mapper.updateMission(Mission);  
            //*
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
	public Integer deleteMission(Mission Mission){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            MissionMapper mapper = session.getMapper(MissionMapper.class);  
            count = mapper.deleteMission(Mission);  
            //*
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
}