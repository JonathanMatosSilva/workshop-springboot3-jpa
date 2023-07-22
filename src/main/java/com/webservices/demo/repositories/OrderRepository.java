package com.webservices.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
