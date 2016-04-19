package com.zxc.mapper;

import java.util.List;

import com.zxc.entity.Resume;

public interface ResumeMapper {

	public Resume selectResume(Resume resume);

	public Integer insertResume(Resume resume);
	
	public List<Resume> selectResumes();
	
	public Integer updateResume(Resume resume);
	
	public Integer deleteResume(Resume resume);

	
}
