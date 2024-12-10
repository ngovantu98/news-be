package com.vti.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@PostMapping()
	public ResponseEntity<String> createUser(@RequestBody UserFormCreate form) {
		service.createUser(form);
		return new ResponseEntity<String>("Tạo mớingười dùng thành công!", HttpStatus.OK);
	}

}
