package com.vti.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class UserDTO implements Serializable {

	private int id;
	private String userName;
	private String password;
	private String email;
	private String fullName;

	
	

	public UserDTO(int id, String userName, String password, String email, String fullName) {
	
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.fullName = fullName;
	}

	public UserDTO() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	
}
