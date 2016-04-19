package com.zxc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *雇员基础表 
 **/
@Entity
@Table(name="t_emp_base_info")
public class EmpBaseInfo {

	@Id
	@Column(name="empBaseId")
	private Integer empBaseId;
	
	@Column(name="empId")
	private Integer empId;
	
	@Column(name="empAge")
	private Integer empAge;
	
	@Column(name="stationId")
	private Integer stationId;

	@Column(name="idCard")
	private Integer idCard;
	
	@Column(name="empSex")
	private boolean empSex;
	
	@Column(name="empName")
	private String empName;
	
	@Column(name="empEducation")
	private String empEducation;
	
	@Column(name="empBirthday")
	private Date empBirthday;

	public Integer getEmpBaseId() {
		return empBaseId;
	}

	public void setEmpBaseId(Integer empBaseId) {
		this.empBaseId = empBaseId;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Integer getEmpAge() {
		return empAge;
	}

	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}

	public Integer getStationId() {
		return stationId;
	}

	public void setStationId(Integer stationId) {
		this.stationId = stationId;
	}

	public Integer getIdCard() {
		return idCard;
	}

	public void setIdCard(Integer idCard) {
		this.idCard = idCard;
	}

	public boolean isEmpSex() {
		return empSex;
	}

	public void setEmpSex(boolean empSex) {
		this.empSex = empSex;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEducation() {
		return empEducation;
	}

	public void setEmpEducation(String empEducation) {
		this.empEducation = empEducation;
	}

	public Date getEmpBirthday() {
		return empBirthday;
	}

	public void setEmpBirthday(Date empBirthday) {
		this.empBirthday = empBirthday;
	}
	
	
	
	
	
}
