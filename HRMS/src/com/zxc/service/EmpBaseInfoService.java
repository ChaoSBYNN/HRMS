package com.zxc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zxc.dao.EmpBaseInfoDao;
import com.zxc.entity.EmpBaseInfo;

@Service
public class EmpBaseInfoService {
	
private EmpBaseInfoDao EmpBaseInfoDao;
	
	public EmpBaseInfo selectEmpBaseInfo(EmpBaseInfo EmpBaseInfo){
		EmpBaseInfoDao = new EmpBaseInfoDao();
		return EmpBaseInfoDao.selectEmpBaseInfo(EmpBaseInfo);
	}

	public Integer insertEmpBaseInfo(EmpBaseInfo EmpBaseInfo){
		EmpBaseInfoDao = new EmpBaseInfoDao();
		return EmpBaseInfoDao.insertEmpBaseInfo(EmpBaseInfo);
	}
	
	public List<EmpBaseInfo> selectEmpBaseInfos(){
		EmpBaseInfoDao = new EmpBaseInfoDao();
		return EmpBaseInfoDao.selectEmpBaseInfos();
	}
	
	public Integer updateEmpBaseInfo(EmpBaseInfo EmpBaseInfo){
		EmpBaseInfoDao = new EmpBaseInfoDao();
		return EmpBaseInfoDao.updateEmpBaseInfo(EmpBaseInfo);
	}
	
	public Integer deleteEmpBaseInfo(EmpBaseInfo EmpBaseInfo){
		EmpBaseInfoDao = new EmpBaseInfoDao();
		return EmpBaseInfoDao.deleteEmpBaseInfo(EmpBaseInfo);
	}
}
