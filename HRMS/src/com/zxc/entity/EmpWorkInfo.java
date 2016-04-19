package com.zxc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *雇员工作经历表 
 **/
@Entity
@Table(name="t_emp_work_info")
public class EmpWorkInfo {

	@Id
	@Column(name="empWorkId")
	private Integer empWorkId;
	
	@Column(name="empId")
	private Integer empId;
	
	@Column(name="companyName")
	private String companyName;
	
	@Column(name="exstation")
	private String exstation;
	
	//职责 工作内容
	@Column(name="duty")
	private String duty;
	
	@Column(name="enterdate")
	private Date enterdate;
	
	@Column(name="leavedate")
	private Date leavedate;

	public Integer getEmpWorkId() {
		return empWorkId;
	}

	public void setEmpWorkId(Integer empWorkId) {
		this.empWorkId = empWorkId;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getExstation() {
		return exstation;
	}

	public void setExstation(String exstation) {
		this.exstation = exstation;
	}

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
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
