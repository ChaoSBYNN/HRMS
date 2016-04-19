package com.zxc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zxc.dao.EmpWorkInfoDao;
import com.zxc.entity.EmpWorkInfo;

@Service
public class EmpWorkInfoService {
	
private EmpWorkInfoDao EmpWorkInfoDao;
	
	public EmpWorkInfo selectEmpWorkInfo(EmpWorkInfo EmpWorkInfo){
		EmpWorkInfoDao = new EmpWorkInfoDao();
		return EmpWorkInfoDao.selectEmpWorkInfo(EmpWorkInfo);
	}

	public Integer insertEmpWorkInfo(EmpWorkInfo EmpWorkInfo){
		EmpWorkInfoDao = new EmpWorkInfoDao();
		return EmpWorkInfoDao.insertEmpWorkInfo(EmpWorkInfo);
	}
	
	public List<EmpWorkInfo> selectEmpWorkInfos(){
		EmpWorkInfoDao = new EmpWorkInfoDao();
		return EmpWorkInfoDao.selectEmpWorkInfos();
	}
	
	public Integer updateEmpWorkInfo(EmpWorkInfo EmpWorkInfo){
		EmpWorkInfoDao = new EmpWorkInfoDao();
		return EmpWorkInfoDao.updateEmpWorkInfo(EmpWorkInfo);
	}
	
	public Integer deleteEmpWorkInfo(EmpWorkInfo EmpWorkInfo){
		EmpWorkInfoDao = new EmpWorkInfoDao();
		return EmpWorkInfoDao.deleteEmpWorkInfo(EmpWorkInfo);
	}
}
