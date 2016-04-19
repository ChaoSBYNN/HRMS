package com.zxc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *雇员就职表 
 **/
@Entity
@Table(name="t_emp_office_info")
public class EmpOfficeInfo {

	@Id
	@Column(name="empOfficeId")
	private Integer empOfficeId;
	
	@Column(name="empId")
	private Integer empId;
	
	//1全职    2试用    3 兼职    4离职    5返聘
	@Column(name="officeType")
	private Integer officeType;
	
	@Column(name="hiredate")
	private Date hiredate;
	
	@Column(name="resigndate")
	private Date resigndate;
	
	@Column(name="isResign")
	private boolean isResign;

	public Integer getEmpOfficeId() {
		return empOfficeId;
	}

	public void setEmpOfficeId(Integer empOfficeId) {
		this.empOfficeId = empOfficeId;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Integer getOfficeType() {
		return officeType;
	}

	public void setOfficeType(Integer officeType) {
		this.officeType = officeType;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public Date getResigndate() {
		return resigndate;
	}

	public void setResigndate(Date resigndate) {
		this.resigndate = resigndate;
	}

	public boolean isResign() {
		return isResign;
	}

	public void setResign(boolean isResign) {
		this.isResign = isResign;
	}

	
	
}
