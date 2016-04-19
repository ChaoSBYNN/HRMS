package com.zxc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zxc.dao.EmpContactInfoDao;
import com.zxc.entity.EmpContactInfo;

@Service
public class EmpContactInfoService {
	
private EmpContactInfoDao EmpContactInfoDao;
	
	public EmpContactInfo selectEmpContactInfo(EmpContactInfo EmpContactInfo){
		EmpContactInfoDao = new EmpContactInfoDao();
		return EmpContactInfoDao.selectEmpContactInfo(EmpContactInfo);
	}

	public Integer insertEmpContactInfo(EmpContactInfo EmpContactInfo){
		EmpContactInfoDao = new EmpContactInfoDao();
		return EmpContactInfoDao.insertEmpContactInfo(EmpContactInfo);
	}
	
	public List<EmpContactInfo> selectEmpContactInfos(){
		EmpContactInfoDao = new EmpContactInfoDao();
		return EmpContactInfoDao.selectEmpContactInfos();
	}
	
	public Integer updateEmpContactInfo(EmpContactInfo EmpContactInfo){
		EmpContactInfoDao = new EmpContactInfoDao();
		return EmpContactInfoDao.updateEmpContactInfo(EmpContactInfo);
	}
	
	public Integer deleteEmpContactInfo(EmpContactInfo EmpContactInfo){
		EmpContactInfoDao = new EmpContactInfoDao();
		return EmpContactInfoDao.deleteEmpContactInfo(EmpContactInfo);
	}
}
