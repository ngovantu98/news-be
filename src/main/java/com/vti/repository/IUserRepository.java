package com.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vti.entity.User;

public interface IUserRepository extends JpaRepository<User, Integer> {

	public User findByUserName(String userName);
	public boolean existsByUserName(String userName);
}
