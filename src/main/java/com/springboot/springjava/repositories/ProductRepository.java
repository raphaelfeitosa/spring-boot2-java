package com.springboot.springjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springjava.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
