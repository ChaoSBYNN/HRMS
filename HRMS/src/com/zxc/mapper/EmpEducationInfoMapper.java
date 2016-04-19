package com.zxc.mapper;

import java.util.List;

import com.zxc.entity.EmpEducationInfo;

public interface EmpEducationInfoMapper {

	public EmpEducationInfo selectEmpEducationInfo(EmpEducationInfo eei);

	public Integer insertEmpEducationInfo(EmpEducationInfo eei);
	
	public List<EmpEducationInfo> selectEmpEducationInfos();
	
	public Integer updateEmpEducationInfo(EmpEducationInfo eei);
	
	public Integer deleteEmpEducationInfo(EmpEducationInfo eei);

	
}
