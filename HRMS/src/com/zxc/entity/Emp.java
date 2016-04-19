package com.zxc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *雇员表
 **/
@Entity
@Table(name="t_staff")
public class Emp {

	@Id
	@Column(name="empId")
	private Integer empId;
	
	@Column(name="userId")
	private Integer userId;
	
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}



}
