package com.vti.form;


import com.vti.entity.User;

public class UserFormCreate {

	private int id;
	private String userName;
	private String password;
	private String email;
	private String fullName;
	private String role;

	public UserFormCreate() {
	}

	public UserFormCreate(int id, String userName, String password, String email, String fullName, String role) {

		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.fullName = fullName;
		this.role = role;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public User toEntity() {
		return new User(id, userName, password,email, fullName, role);
	}

}
