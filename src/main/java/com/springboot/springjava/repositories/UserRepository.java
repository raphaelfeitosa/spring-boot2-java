package com.springboot.springjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springjava.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
