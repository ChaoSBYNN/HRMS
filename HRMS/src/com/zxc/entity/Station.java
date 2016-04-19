package com.zxc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *职位表 
 **/
@Entity
@Table(name="t_station")
public class Station {
	
	@Id
	@Column(name="stationId")
	private Integer stationId;

	@Column(name="deptId")
	private Integer deptId;

	@Column(name="fatherId")
	private Integer fatherId;
	
	@Column(name="stationName")
	private String stationName;

	public Integer getStationId() {
		return stationId;
	}

	public void setStationId(Integer stationId) {
		this.stationId = stationId;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public Integer getFatherId() {
		return fatherId;
	}

	public void setFatherId(Integer fatherId) {
		this.fatherId = fatherId;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	
	
	
	
	
}
