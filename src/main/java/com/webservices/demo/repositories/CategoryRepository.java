package com.webservices.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
