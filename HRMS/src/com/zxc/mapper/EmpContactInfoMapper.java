package com.zxc.mapper;

import java.util.List;

import com.zxc.entity.EmpContactInfo;

public interface EmpContactInfoMapper {

	public EmpContactInfo selectEmpContactInfo(EmpContactInfo eci);

	public Integer insertEmpContactInfo(EmpContactInfo eci);
	
	public List<EmpContactInfo> selectEmpContactInfos();
	
	public Integer updateEmpContactInfo(EmpContactInfo eci);
	
	public Integer deleteEmpContactInfo(EmpContactInfo eci);

	
}
