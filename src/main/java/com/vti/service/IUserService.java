package com.vti.service;

import java.util.List;
import org.springframework.security.core.userdetails.UserDetailsService;
import com.vti.entity.User;
import com.vti.form.UserFormCreate;

public interface IUserService extends UserDetailsService {

	public List<User> getAllUsers();
	
	public void createUser(UserFormCreate from);

	boolean existsUserByUserName(String userName);

}
