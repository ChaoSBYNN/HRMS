package com.zxc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *任务表 
 **/
@Entity
@Table(name="t_mission")
public class Mission {

	@Id
	@Column(name="missionId")
	private Integer missionId;

	@Column(name="issuerId")
	private Integer issuerId;
	
	@Column(name="missionName")
	private String missionName;
	
	@Column(name="missionInfo")
	private String missionInfo;
	
	@Column(name="issuedate")
	private String issuedate;

	public Integer getMissionId() {
		return missionId;
	}

	public void setMissionId(Integer missionId) {
		this.missionId = missionId;
	}

	public Integer getIssuerId() {
		return issuerId;
	}

	public void setIssuerId(Integer issuerId) {
		this.issuerId = issuerId;
	}

	public String getMissionName() {
		return missionName;
	}

	public void setMissionName(String missionName) {
		this.missionName = missionName;
	}

	public String getMissionInfo() {
		return missionInfo;
	}

	public void setMissionInfo(String missionInfo) {
		this.missionInfo = missionInfo;
	}

	public String getIssuedate() {
		return issuedate;
	}

	public void setIssuedate(String issuedate) {
		this.issuedate = issuedate;
	}
	
	
	
	
}
