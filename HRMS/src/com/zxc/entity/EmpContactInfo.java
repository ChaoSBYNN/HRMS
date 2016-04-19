package com.zxc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *雇员联系表 
 **/
@Entity
@Table(name="t_emp_contact_info")
public class EmpContactInfo {

	@Id
	@Column(name="empContactId")
	private Integer empContactId;

	@Column(name="empId")
	private Integer empId;

	@Column(name="officePhone")
	private Integer officePhone;

	@Column(name="homePhone")
	private Integer homePhone;
	
	@Column(name="mobilePhone")
	private Integer mobilePhone;
	
	@Column(name="empEmail")
	private String empEmail;

	@Column(name="empAddress")
	private String empAddress;

	public Integer getEmpContactId() {
		return empContactId;
	}

	public void setEmpContactId(Integer empContactId) {
		this.empContactId = empContactId;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Integer getOfficePhone() {
		return officePhone;
	}

	public void setOfficePhone(Integer officePhone) {
		this.officePhone = officePhone;
	}

	public Integer getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(Integer homePhone) {
		this.homePhone = homePhone;
	}

	public Integer getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(Integer mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
	
	
}
