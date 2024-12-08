package com.vti.form;

import com.vti.entity.User;
import com.vti.entity.User.Role;

public class UserFormCreate {

	private int id;
	private String userName;
	private String password;
	private String email;
	private String fullName;
	private Role role;

	public UserFormCreate() {
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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public User toEntity() {
		return new User(id, userName, password, email, fullName, role);
	}

}
