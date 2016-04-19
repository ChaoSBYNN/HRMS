package com.zxc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zxc.dao.EmpDao;
import com.zxc.entity.Emp;

@Service
public class EmpService {
	
private EmpDao EmpDao;
	
	public Emp selectEmp(Emp Emp){
		EmpDao = new EmpDao();
		return EmpDao.selectEmp(Emp);
	}

	public Integer insertEmp(Emp Emp){
		EmpDao = new EmpDao();
		return EmpDao.insertEmp(Emp);
	}
	
	public List<Emp> selectEmps(){
		EmpDao = new EmpDao();
		return EmpDao.selectEmps();
	}
	
	public Integer updateEmp(Emp Emp){
		EmpDao = new EmpDao();
		return EmpDao.updateEmp(Emp);
	}
	
	public Integer deleteEmp(Emp Emp){
		EmpDao = new EmpDao();
		return EmpDao.deleteEmp(Emp);
	}
}
