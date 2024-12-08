package com.vti.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vti.entity.User;
import com.vti.form.UserFormCreate;
import com.vti.repository.IUserRepository;


@Service
public class UserService implements IUserService {

	@Autowired
	private IUserRepository repository;

	public List<User> getAllUsers() {
		return repository.findAll();
	}

	public User getUserByID(int id) {
		return repository.findById(id).get();
	}

	public void createUser(UserFormCreate from) {
		repository.save(from.toEntity());
	}

	public void updateUser(User user) {
		repository.save(user);
	}

	public void deleteUser(int id) {
		repository.deleteById(id);
	}

	public boolean isUserExistsByID(int id) {
		return repository.existsById(id);
	}


}
