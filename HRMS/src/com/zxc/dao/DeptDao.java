package com.zxc.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.zxc.entity.Dept;
import com.zxc.mapper.DeptMapper;
import com.zxc.util.MyBatisUtil;

public class DeptDao {

	static SqlSessionFactory sqlSessionFactory = null;

	static {
		sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
	}

	public Dept selectDept(Dept Dept) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			DeptMapper DeptMapper = sqlSession.getMapper(DeptMapper.class);
			Dept = DeptMapper.selectDept(Dept);
		} finally {
			sqlSession.close();
		}
		return Dept;
	}

	public List<Dept> selectDepts() {
		SqlSession session = sqlSessionFactory.openSession();
		List<Dept> Depts = null;
		try {
			DeptMapper mapper = session.getMapper(DeptMapper.class);
			Depts = (List<Dept>) mapper.selectDepts();
		} finally {
			session.close();
		}
		return Depts;
	}
	
	public Integer insertDept(Dept Dept){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            DeptMapper mapper = session.getMapper(DeptMapper.class);  
            count = mapper.insertDept(Dept);  
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
	public Integer updateDept(Dept Dept){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            DeptMapper mapper = session.getMapper(DeptMapper.class);  
            count = mapper.updateDept(Dept);  
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
	public Integer deleteDept(Dept Dept){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            DeptMapper mapper = session.getMapper(DeptMapper.class);  
            count = mapper.deleteDept(Dept);  
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
}