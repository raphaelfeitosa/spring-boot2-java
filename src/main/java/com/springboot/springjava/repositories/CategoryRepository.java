package com.springboot.springjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springjava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
