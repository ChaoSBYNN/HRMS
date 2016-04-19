package com.zxc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zxc.dao.EmpOfficeInfoDao;
import com.zxc.entity.EmpOfficeInfo;

@Service
public class EmpOfficeInfoService {
	
private EmpOfficeInfoDao EmpOfficeInfoDao;
	
	public EmpOfficeInfo selectEmpOfficeInfo(EmpOfficeInfo EmpOfficeInfo){
		EmpOfficeInfoDao = new EmpOfficeInfoDao();
		return EmpOfficeInfoDao.selectEmpOfficeInfo(EmpOfficeInfo);
	}

	public Integer insertEmpOfficeInfo(EmpOfficeInfo EmpOfficeInfo){
		EmpOfficeInfoDao = new EmpOfficeInfoDao();
		return EmpOfficeInfoDao.insertEmpOfficeInfo(EmpOfficeInfo);
	}
	
	public List<EmpOfficeInfo> selectEmpOfficeInfos(){
		EmpOfficeInfoDao = new EmpOfficeInfoDao();
		return EmpOfficeInfoDao.selectEmpOfficeInfos();
	}
	
	public Integer updateEmpOfficeInfo(EmpOfficeInfo EmpOfficeInfo){
		EmpOfficeInfoDao = new EmpOfficeInfoDao();
		return EmpOfficeInfoDao.updateEmpOfficeInfo(EmpOfficeInfo);
	}
	
	public Integer deleteEmpOfficeInfo(EmpOfficeInfo EmpOfficeInfo){
		EmpOfficeInfoDao = new EmpOfficeInfoDao();
		return EmpOfficeInfoDao.deleteEmpOfficeInfo(EmpOfficeInfo);
	}
}
