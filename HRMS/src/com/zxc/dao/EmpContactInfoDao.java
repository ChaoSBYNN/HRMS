package com.zxc.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.zxc.entity.EmpContactInfo;
import com.zxc.mapper.EmpContactInfoMapper;
import com.zxc.util.MyBatisUtil;

public class EmpContactInfoDao {

	static SqlSessionFactory sqlSessionFactory = null;

	static {
		sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
	}

	public EmpContactInfo selectEmpContactInfo(EmpContactInfo EmpContactInfo) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			EmpContactInfoMapper EmpContactInfoMapper = sqlSession.getMapper(EmpContactInfoMapper.class);
			EmpContactInfo = EmpContactInfoMapper.selectEmpContactInfo(EmpContactInfo);
		} finally {
			sqlSession.close();
		}
		return EmpContactInfo;
	}

	public List<EmpContactInfo> selectEmpContactInfos() {
		SqlSession session = sqlSessionFactory.openSession();
		List<EmpContactInfo> EmpContactInfos = null;
		try {
			EmpContactInfoMapper mapper = session.getMapper(EmpContactInfoMapper.class);
			EmpContactInfos = (List<EmpContactInfo>) mapper.selectEmpContactInfos();
			for (EmpContactInfo EmpContactInfo : EmpContactInfos) {
				System.out.println(EmpContactInfo.getMobilePhone());
			}
		} finally {
			session.close();
		}
		return EmpContactInfos;
	}
	
	public Integer insertEmpContactInfo(EmpContactInfo EmpContactInfo){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            EmpContactInfoMapper mapper = session.getMapper(EmpContactInfoMapper.class);  
            count = mapper.insertEmpContactInfo(EmpContactInfo);  
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
	public Integer updateEmpContactInfo(EmpContactInfo EmpContactInfo){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            EmpContactInfoMapper mapper = session.getMapper(EmpContactInfoMapper.class);  
            count = mapper.updateEmpContactInfo(EmpContactInfo);  
            //*
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
	public Integer deleteEmpContactInfo(EmpContactInfo EmpContactInfo){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            EmpContactInfoMapper mapper = session.getMapper(EmpContactInfoMapper.class);  
            count = mapper.deleteEmpContactInfo(EmpContactInfo);  
            //*
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
}