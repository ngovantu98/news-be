package com.vti.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vti.entity.User;
import com.vti.form.UserFormCreate;
import com.vti.service.IUserService;

@RestController
@RequestMapping(value = "api/v1/users")
public class UserController {

	@Autowired
	private IUserService service;

	@GetMapping()
	public List<User> getAllUsers() {
		return service.getAllUsers();
	}

	@GetMapping(value = "/{id}")
	public User getUserByID(@PathVariable(name = "id") int id) {
		return service.getUserByID(id);
	}

	@PostMapping()
	public ResponseEntity<String> createUser(@RequestBody UserFormCreate form) {
		service.createUser(form);
		return new ResponseEntity<String>("Tạo mới người dùng thành công!", HttpStatus.OK);
	}

	@PutMapping(value = "/{id}")
	public void updateUser(@PathVariable(name = "id") int id, @RequestBody UserFormCreate form) {
		User user = form.toEntity();
		user.setId(id);
		service.updateUser(user);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteUser(@PathVariable(name = "id") int id) {
		service.deleteUser(id);
	}
}
