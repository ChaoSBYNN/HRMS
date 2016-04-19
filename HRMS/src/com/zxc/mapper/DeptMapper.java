package com.zxc.mapper;

import java.util.List;

import com.zxc.entity.Dept;

public interface DeptMapper {

	public Dept selectDept(Dept dept);

	public Integer insertDept(Dept dept);
	
	public List<Dept> selectDepts();
	
	public Integer updateDept(Dept dept);
	
	public Integer deleteDept(Dept dept);

	
}
