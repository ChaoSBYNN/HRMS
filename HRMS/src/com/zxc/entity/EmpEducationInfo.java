package com.zxc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *雇员学历表 
 **/
@Entity
@Table(name="t_emp_education_info")
public class EmpEducationInfo {

	@Id
	@Column(name="empEducationId")
	private Integer empEducationId;
	
	@Column(name="empId")
	private Integer empId;
	
	@Column(name="schoolName")
	private String schoolName;
	
	@Column(name="enterdate")
	private Date enterdate;
	
	@Column(name="leavedate")
	private Date leavedate;

	public Integer getEmpEducationId() {
		return empEducationId;
	}

	public void setEmpEducationId(Integer empEducationId) {
		this.empEducationId = empEducationId;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Date getEnterdate() {
		return enterdate;
	}

	public void setEnterdate(Date enterdate) {
		this.enterdate = enterdate;
	}

	public Date getLeavedate() {
		return leavedate;
	}

	public void setLeavedate(Date leavedate) {
		this.leavedate = leavedate;
	}
	
	
	
}
