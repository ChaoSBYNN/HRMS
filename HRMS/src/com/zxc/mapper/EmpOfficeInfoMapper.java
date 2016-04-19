package com.zxc.mapper;

import java.util.List;

import com.zxc.entity.EmpOfficeInfo;

public interface EmpOfficeInfoMapper {

	public EmpOfficeInfo selectEmpOfficeInfo(EmpOfficeInfo eoi);

	public Integer insertEmpOfficeInfo(EmpOfficeInfo eoi);
	
	public List<EmpOfficeInfo> selectEmpOfficeInfos();
	
	public Integer updateEmpOfficeInfo(EmpOfficeInfo eoi);
	
	public Integer deleteEmpOfficeInfo(EmpOfficeInfo eoi);

	
}
