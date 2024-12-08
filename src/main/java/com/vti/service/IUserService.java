package com.vti.service;

import java.util.List;
import com.vti.entity.User;
import com.vti.form.UserFormCreate;

public interface IUserService {

	public List<User> getAllUsers();

	public User getUserByID(int id);

	public void createUser(UserFormCreate from);

	public void updateUser(User user);

	public void deleteUser(int id);

	public boolean isUserExistsByID(int id);

	
}
