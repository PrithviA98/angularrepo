package com.aciworldwide.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
//@Entity(name="UserMaster")//optional...Name of the table...only thing is no. of properties should be = no of colummns
public class User {

	@Id
	@Column(name="userid")//optional
	private Long userId;
	private String username;
	private String password;
	
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
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
}
