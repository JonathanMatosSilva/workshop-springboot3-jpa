package com.webservices.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.demo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	

}
