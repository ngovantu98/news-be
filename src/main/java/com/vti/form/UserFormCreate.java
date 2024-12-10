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



	public User toEntity() {
		return new User(id, userName, password, email, fullName, role);
	}

}
