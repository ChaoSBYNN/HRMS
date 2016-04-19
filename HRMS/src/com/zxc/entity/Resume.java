package com.zxc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *简历表 
 **/
@Entity
@Table(name="t_resume")
public class Resume {

	@Id
	@Column(name="resumeId")
	private Integer resumeId;
	
	@Column(name="userId")
	private Integer userId;
	
	@Column(name="resumePath")
	private String resumePath;

	public Integer getResumeId() {
		return resumeId;
	}

	public void setResumeId(Integer resumeId) {
		this.resumeId = resumeId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getResumePath() {
		return resumePath;
	}

	public void setResumePath(String resumePath) {
		this.resumePath = resumePath;
	}
	
}
