package com.zxc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *部门表
 **/
@Entity
@Table(name="t_dept")
public class Dept {

	@Id
	@Column(name="deptId")
	private Integer deptId;
	
	@Column(name="deptName")
	private String deptName;
	
	@Column(name="fatherId")
	private Integer fatherId;

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Integer getFatherId() {
		return fatherId;
	}

	public void setFatherId(Integer fatherId) {
		this.fatherId = fatherId;
	}

}
