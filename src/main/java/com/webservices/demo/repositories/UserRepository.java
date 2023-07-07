package com.webservices.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
