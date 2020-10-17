package com.sba3.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sba3.rest.entity.User;


public interface UserRepo extends JpaRepository<User, Integer> {
	
	

}
