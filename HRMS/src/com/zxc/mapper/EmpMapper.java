package com.zxc.mapper;

import java.util.List;

import com.zxc.entity.Emp;

public interface EmpMapper {

	public Emp selectEmp(Emp emp);

	public Integer insertEmp(Emp emp);
	
	public List<Emp> selectEmps();
	
	public Integer updateEmp(Emp emp);
	
	public Integer deleteEmp(Emp emp);

	
}
