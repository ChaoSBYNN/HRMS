package com.zxc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *用户表 
 **/
@Entity
@Table(name="t_user")
public class User {
		
	@Id
	@Column(name="userId")
	private Integer userId;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


//	@Override
//	public boolean equals(Object obj) {
//		return this.userId == ((User) obj).userId
//				? this.username.equals(((User) obj).username) 
//					? this.password == ((User) obj).password 
//						? true : false 
//					: false 
//				: false;
//	}
	
}
