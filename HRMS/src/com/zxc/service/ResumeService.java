package com.zxc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zxc.dao.ResumeDao;
import com.zxc.entity.Resume;

@Service
public class ResumeService {
	
private ResumeDao ResumeDao;
	
	public Resume selectResume(Resume Resume){
		ResumeDao = new ResumeDao();
		return ResumeDao.selectResume(Resume);
	}

	public Integer insertResume(Resume Resume){
		ResumeDao = new ResumeDao();
		return ResumeDao.insertResume(Resume);
	}
	
	public List<Resume> selectResumes(){
		ResumeDao = new ResumeDao();
		return ResumeDao.selectResumes();
	}
	
	public Integer updateResume(Resume Resume){
		ResumeDao = new ResumeDao();
		return ResumeDao.updateResume(Resume);
	}
	
	public Integer deleteResume(Resume Resume){
		ResumeDao = new ResumeDao();
		return ResumeDao.deleteResume(Resume);
	}
}
