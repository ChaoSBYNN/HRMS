package com.zxc.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.zxc.entity.EmpBaseInfo;
import com.zxc.mapper.EmpBaseInfoMapper;
import com.zxc.util.MyBatisUtil;

public class EmpBaseInfoDao {

	static SqlSessionFactory sqlSessionFactory = null;

	static {
		sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
	}

	public EmpBaseInfo selectEmpBaseInfo(EmpBaseInfo EmpBaseInfo) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			EmpBaseInfoMapper EmpBaseInfoMapper = sqlSession.getMapper(EmpBaseInfoMapper.class);
			EmpBaseInfo = EmpBaseInfoMapper.selectEmpBaseInfo(EmpBaseInfo);
		} finally {
			sqlSession.close();
		}
		return EmpBaseInfo;
	}

	public List<EmpBaseInfo> selectEmpBaseInfos() {
		SqlSession session = sqlSessionFactory.openSession();
		List<EmpBaseInfo> EmpBaseInfos = null;
		try {
			EmpBaseInfoMapper mapper = session.getMapper(EmpBaseInfoMapper.class);
			EmpBaseInfos = (List<EmpBaseInfo>) mapper.selectEmpBaseInfos();
			for (EmpBaseInfo EmpBaseInfo : EmpBaseInfos) {
				System.out.println(EmpBaseInfo.getEmpName());
			}
		} finally {
			session.close();
		}
		return EmpBaseInfos;
	}
	
	public Integer insertEmpBaseInfo(EmpBaseInfo EmpBaseInfo){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            EmpBaseInfoMapper mapper = session.getMapper(EmpBaseInfoMapper.class);  
            count = mapper.insertEmpBaseInfo(EmpBaseInfo);  
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
	public Integer updateEmpBaseInfo(EmpBaseInfo EmpBaseInfo){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            EmpBaseInfoMapper mapper = session.getMapper(EmpBaseInfoMapper.class);  
            count = mapper.updateEmpBaseInfo(EmpBaseInfo);  
            //*
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
	public Integer deleteEmpBaseInfo(EmpBaseInfo EmpBaseInfo){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            EmpBaseInfoMapper mapper = session.getMapper(EmpBaseInfoMapper.class);  
            count = mapper.deleteEmpBaseInfo(EmpBaseInfo);  
            //*
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
}