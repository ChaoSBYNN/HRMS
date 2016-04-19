package com.zxc.mapper;

import java.util.List;

import com.zxc.entity.EmpWorkInfo;

public interface EmpWorkInfoMapper {

	public EmpWorkInfo selectEmpWorkInfo(EmpWorkInfo ewi);

	public Integer insertEmpWorkInfo(EmpWorkInfo ewi);
	
	public List<EmpWorkInfo> selectEmpWorkInfos();
	
	public Integer updateEmpWorkInfo(EmpWorkInfo ewi);
	
	public Integer deleteEmpWorkInfo(EmpWorkInfo ewi);

	
}
