package com.springboot.springjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springjava.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}
