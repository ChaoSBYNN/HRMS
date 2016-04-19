package com.zxc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zxc.dao.DeptDao;
import com.zxc.entity.Dept;

@Service
public class DeptService {
	
private DeptDao DeptDao;
	
	public Dept selectDept(Dept Dept){
		DeptDao = new DeptDao();
		return DeptDao.selectDept(Dept);
	}

	public Integer insertDept(Dept Dept){
		DeptDao = new DeptDao();
		return DeptDao.insertDept(Dept);
	}
	
	public List<Dept> selectDepts(){
		DeptDao = new DeptDao();
		return DeptDao.selectDepts();
	}
	
	public Integer updateDept(Dept Dept){
		DeptDao = new DeptDao();
		return DeptDao.updateDept(Dept);
	}
	
	public Integer deleteDept(Dept Dept){
		DeptDao = new DeptDao();
		return DeptDao.deleteDept(Dept);
	}
}
