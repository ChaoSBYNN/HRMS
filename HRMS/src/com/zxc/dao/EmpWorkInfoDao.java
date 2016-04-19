package com.zxc.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.zxc.entity.EmpWorkInfo;
import com.zxc.mapper.EmpWorkInfoMapper;
import com.zxc.util.MyBatisUtil;

public class EmpWorkInfoDao {

	static SqlSessionFactory sqlSessionFactory = null;

	static {
		sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
	}

	public EmpWorkInfo selectEmpWorkInfo(EmpWorkInfo EmpWorkInfo) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			EmpWorkInfoMapper EmpWorkInfoMapper = sqlSession.getMapper(EmpWorkInfoMapper.class);
			EmpWorkInfo = EmpWorkInfoMapper.selectEmpWorkInfo(EmpWorkInfo);
		} finally {
			sqlSession.close();
		}
		return EmpWorkInfo;
	}

	public List<EmpWorkInfo> selectEmpWorkInfos() {
		SqlSession session = sqlSessionFactory.openSession();
		List<EmpWorkInfo> EmpWorkInfos = null;
		try {
			EmpWorkInfoMapper mapper = session.getMapper(EmpWorkInfoMapper.class);
			EmpWorkInfos = (List<EmpWorkInfo>) mapper.selectEmpWorkInfos();
			for (EmpWorkInfo EmpWorkInfo : EmpWorkInfos) {
				System.out.println(EmpWorkInfo.getCompanyName());
			}
		} finally {
			session.close();
		}
		return EmpWorkInfos;
	}
	
	public Integer insertEmpWorkInfo(EmpWorkInfo EmpWorkInfo){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            EmpWorkInfoMapper mapper = session.getMapper(EmpWorkInfoMapper.class);  
            count = mapper.insertEmpWorkInfo(EmpWorkInfo);  
            //*
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
	public Integer updateEmpWorkInfo(EmpWorkInfo EmpWorkInfo){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            EmpWorkInfoMapper mapper = session.getMapper(EmpWorkInfoMapper.class);  
            count = mapper.updateEmpWorkInfo(EmpWorkInfo);  
            //*
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
	public Integer deleteEmpWorkInfo(EmpWorkInfo EmpWorkInfo){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            EmpWorkInfoMapper mapper = session.getMapper(EmpWorkInfoMapper.class);  
            count = mapper.deleteEmpWorkInfo(EmpWorkInfo);  
            //*
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
}