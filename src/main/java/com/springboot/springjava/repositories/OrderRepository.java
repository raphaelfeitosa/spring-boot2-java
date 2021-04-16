package com.springboot.springjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springjava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
