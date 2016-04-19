package com.zxc.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.zxc.entity.Resume;
import com.zxc.mapper.ResumeMapper;
import com.zxc.util.MyBatisUtil;

public class ResumeDao {

	static SqlSessionFactory sqlSessionFactory = null;

	static {
		sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
	}

	public Resume selectResume(Resume resume) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			ResumeMapper resumeMapper = sqlSession.getMapper(ResumeMapper.class);
			resume = resumeMapper.selectResume(resume);
		} finally {
			sqlSession.close();
		}
		return resume;
	}

	public List<Resume> selectResumes() {
		SqlSession session = sqlSessionFactory.openSession();
		List<Resume> resumes = null;
		try {
			ResumeMapper mapper = session.getMapper(ResumeMapper.class);
			resumes = (List<Resume>) mapper.selectResumes();
			for (Resume resume : resumes) {
				System.out.println(resume.getResumePath());
			}
		} finally {
			session.close();
		}
		return resumes;
	}
	
	public Integer insertResume(Resume resume){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            ResumeMapper mapper = session.getMapper(ResumeMapper.class);  
            count = mapper.insertResume(resume);  
            //*
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
	public Integer updateResume(Resume resume){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            ResumeMapper mapper = session.getMapper(ResumeMapper.class);  
            count = mapper.updateResume(resume);  
            //*
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
	public Integer deleteResume(Resume resume){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            ResumeMapper mapper = session.getMapper(ResumeMapper.class);  
            count = mapper.deleteResume(resume);  
            //*
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
}