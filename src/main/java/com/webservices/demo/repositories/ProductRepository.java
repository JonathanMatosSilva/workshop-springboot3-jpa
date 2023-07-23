package com.webservices.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
