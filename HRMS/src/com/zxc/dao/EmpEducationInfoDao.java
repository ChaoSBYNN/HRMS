package com.zxc.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.zxc.entity.EmpEducationInfo;
import com.zxc.mapper.EmpEducationInfoMapper;
import com.zxc.util.MyBatisUtil;

public class EmpEducationInfoDao {

	static SqlSessionFactory sqlSessionFactory = null;

	static {
		sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
	}

	public EmpEducationInfo selectEmpEducationInfo(EmpEducationInfo EmpEducationInfo) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			EmpEducationInfoMapper EmpEducationInfoMapper = sqlSession.getMapper(EmpEducationInfoMapper.class);
			EmpEducationInfo = EmpEducationInfoMapper.selectEmpEducationInfo(EmpEducationInfo);
		} finally {
			sqlSession.close();
		}
		return EmpEducationInfo;
	}

	public List<EmpEducationInfo> selectEmpEducationInfos() {
		SqlSession session = sqlSessionFactory.openSession();
		List<EmpEducationInfo> EmpEducationInfos = null;
		try {
			EmpEducationInfoMapper mapper = session.getMapper(EmpEducationInfoMapper.class);
			EmpEducationInfos = (List<EmpEducationInfo>) mapper.selectEmpEducationInfos();
			for (EmpEducationInfo EmpEducationInfo : EmpEducationInfos) {
				System.out.println(EmpEducationInfo.getSchoolName());
			}
		} finally {
			session.close();
		}
		return EmpEducationInfos;
	}
	
	public Integer insertEmpEducationInfo(EmpEducationInfo EmpEducationInfo){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            EmpEducationInfoMapper mapper = session.getMapper(EmpEducationInfoMapper.class);  
            count = mapper.insertEmpEducationInfo(EmpEducationInfo);  
            //*
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
	public Integer updateEmpEducationInfo(EmpEducationInfo EmpEducationInfo){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            EmpEducationInfoMapper mapper = session.getMapper(EmpEducationInfoMapper.class);  
            count = mapper.updateEmpEducationInfo(EmpEducationInfo);  
            //*
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
	public Integer deleteEmpEducationInfo(EmpEducationInfo EmpEducationInfo){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            EmpEducationInfoMapper mapper = session.getMapper(EmpEducationInfoMapper.class);  
            count = mapper.deleteEmpEducationInfo(EmpEducationInfo);  
            //*
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
}