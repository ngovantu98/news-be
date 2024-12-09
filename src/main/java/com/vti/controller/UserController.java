package com.vti.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vti.entity.User;
import com.vti.service.IUserService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "api/v1/users")
public class UserController {

	@Autowired
	private IUserService service;

	@GetMapping()
	public List<User> getAllUsers() {
		return service.getAllUsers();
	}

}
