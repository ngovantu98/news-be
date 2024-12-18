package com.vti.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.vti.entity.User;
import com.vti.form.UserFormCreate;
import com.vti.repository.IUserRepository;


@Service
public class UserService implements IUserService {

	@Autowired
	private IUserRepository repository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public List<User> getAllUsers() {
		return repository.findAll();
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// Check user exists by username
		User user = repository.findByUserName(username);

		if (user == null) {
			throw new UsernameNotFoundException(username);
		}

		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),
				AuthorityUtils.createAuthorityList(user.getRole()));
	}
	
	public void createUser(UserFormCreate from) {
		
		// endcode password
		from.setPassword(passwordEncoder.encode(from.getPassword()));
		repository.save(from.toEntity());
	}
	
	@Override
	public boolean existsUserByUserName(String userName) {
		return repository.existsByUserName(userName);
	}
	
}
