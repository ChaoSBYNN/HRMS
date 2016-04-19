package com.zxc.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.zxc.entity.Emp;
import com.zxc.mapper.EmpMapper;
import com.zxc.util.MyBatisUtil;

public class EmpDao {

	static SqlSessionFactory sqlSessionFactory = null;

	static {
		sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
	}

	public Emp selectEmp(Emp Emp) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			EmpMapper EmpMapper = sqlSession.getMapper(EmpMapper.class);
			Emp = EmpMapper.selectEmp(Emp);
		} finally {
			sqlSession.close();
		}
		return Emp;
	}

	public List<Emp> selectEmps() {
		SqlSession session = sqlSessionFactory.openSession();
		List<Emp> Emps = null;
		try {
			EmpMapper mapper = session.getMapper(EmpMapper.class);
			Emps = (List<Emp>) mapper.selectEmps();
			for (Emp Emp : Emps) {
				System.out.println(Emp.getEmpId());
			}
		} finally {
			session.close();
		}
		return Emps;
	}
	
	public Integer insertEmp(Emp Emp){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            EmpMapper mapper = session.getMapper(EmpMapper.class);  
            count = mapper.insertEmp(Emp);  
            //*
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
	public Integer updateEmp(Emp Emp){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            EmpMapper mapper = session.getMapper(EmpMapper.class);  
            count = mapper.updateEmp(Emp);  
            //*
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
	public Integer deleteEmp(Emp Emp){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            EmpMapper mapper = session.getMapper(EmpMapper.class);  
            count = mapper.deleteEmp(Emp);  
            //*
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
}