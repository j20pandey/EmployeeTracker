package com.one.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class User {
	@Id
	private Long userId;
	private String userName;
	private String userPass;
	
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = (long) userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	

}
