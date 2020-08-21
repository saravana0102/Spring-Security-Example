package com.practice.demo.secureapp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositary extends JpaRepository<Users, Long> {

	public Users findByUsername(String username);
	
}
