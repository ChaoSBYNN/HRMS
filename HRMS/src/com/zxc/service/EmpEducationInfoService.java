package com.zxc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zxc.dao.EmpEducationInfoDao;
import com.zxc.entity.EmpEducationInfo;

@Service
public class EmpEducationInfoService {
	
private EmpEducationInfoDao EmpEducationInfoDao;
	
	public EmpEducationInfo selectEmpEducationInfo(EmpEducationInfo EmpEducationInfo){
		EmpEducationInfoDao = new EmpEducationInfoDao();
		return EmpEducationInfoDao.selectEmpEducationInfo(EmpEducationInfo);
	}

	public Integer insertEmpEducationInfo(EmpEducationInfo EmpEducationInfo){
		EmpEducationInfoDao = new EmpEducationInfoDao();
		return EmpEducationInfoDao.insertEmpEducationInfo(EmpEducationInfo);
	}
	
	public List<EmpEducationInfo> selectEmpEducationInfos(){
		EmpEducationInfoDao = new EmpEducationInfoDao();
		return EmpEducationInfoDao.selectEmpEducationInfos();
	}
	
	public Integer updateEmpEducationInfo(EmpEducationInfo EmpEducationInfo){
		EmpEducationInfoDao = new EmpEducationInfoDao();
		return EmpEducationInfoDao.updateEmpEducationInfo(EmpEducationInfo);
	}
	
	public Integer deleteEmpEducationInfo(EmpEducationInfo EmpEducationInfo){
		EmpEducationInfoDao = new EmpEducationInfoDao();
		return EmpEducationInfoDao.deleteEmpEducationInfo(EmpEducationInfo);
	}
}
