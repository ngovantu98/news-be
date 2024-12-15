package com.vti.dto;

public class UserDTO {

	private String userName;
	private String password;
	private String fullName;

	public UserDTO(String userName, String password, String fullName) {
		super();
		this.userName = userName;
		this.password = password;
		this.fullName = fullName;
	}

	public UserDTO() {

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

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
