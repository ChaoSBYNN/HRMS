package com.zxc.mapper;

import java.util.List;

import com.zxc.entity.EmpBaseInfo;

public interface EmpBaseInfoMapper {

	public EmpBaseInfo selectEmpBaseInfo(EmpBaseInfo ebi);

	public Integer insertEmpBaseInfo(EmpBaseInfo ebi);
	
	public List<EmpBaseInfo> selectEmpBaseInfos();
	
	public Integer updateEmpBaseInfo(EmpBaseInfo ebi);
	
	public Integer deleteEmpBaseInfo(EmpBaseInfo ebi);

	
}
