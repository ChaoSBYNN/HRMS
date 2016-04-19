package com.zxc.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.zxc.entity.EmpOfficeInfo;
import com.zxc.mapper.EmpOfficeInfoMapper;
import com.zxc.util.MyBatisUtil;

public class EmpOfficeInfoDao {

	static SqlSessionFactory sqlSessionFactory = null;

	static {
		sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
	}

	public EmpOfficeInfo selectEmpOfficeInfo(EmpOfficeInfo EmpOfficeInfo) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			EmpOfficeInfoMapper EmpOfficeInfoMapper = sqlSession.getMapper(EmpOfficeInfoMapper.class);
			EmpOfficeInfo = EmpOfficeInfoMapper.selectEmpOfficeInfo(EmpOfficeInfo);
		} finally {
			sqlSession.close();
		}
		return EmpOfficeInfo;
	}

	public List<EmpOfficeInfo> selectEmpOfficeInfos() {
		SqlSession session = sqlSessionFactory.openSession();
		List<EmpOfficeInfo> EmpOfficeInfos = null;
		try {
			EmpOfficeInfoMapper mapper = session.getMapper(EmpOfficeInfoMapper.class);
			EmpOfficeInfos = (List<EmpOfficeInfo>) mapper.selectEmpOfficeInfos();
			for (EmpOfficeInfo EmpOfficeInfo : EmpOfficeInfos) {
				System.out.println(EmpOfficeInfo.getEmpId());
			}
		} finally {
			session.close();
		}
		return EmpOfficeInfos;
	}
	
	public Integer insertEmpOfficeInfo(EmpOfficeInfo EmpOfficeInfo){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            EmpOfficeInfoMapper mapper = session.getMapper(EmpOfficeInfoMapper.class);  
            count = mapper.insertEmpOfficeInfo(EmpOfficeInfo);  
            //*
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
	public Integer updateEmpOfficeInfo(EmpOfficeInfo EmpOfficeInfo){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            EmpOfficeInfoMapper mapper = session.getMapper(EmpOfficeInfoMapper.class);  
            count = mapper.updateEmpOfficeInfo(EmpOfficeInfo);  
            //*
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
	public Integer deleteEmpOfficeInfo(EmpOfficeInfo EmpOfficeInfo){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            EmpOfficeInfoMapper mapper = session.getMapper(EmpOfficeInfoMapper.class);  
            count = mapper.deleteEmpOfficeInfo(EmpOfficeInfo);  
            //*
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
}