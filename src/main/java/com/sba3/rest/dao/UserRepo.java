package com.sba3.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sba3.rest.entity.User;


public interface UserRepo extends JpaRepository<User, Integer> {
	
	User findByEmail(String email);
	
	User findByMobile(String mobile);
	
	User findByUserId(Integer userId);
	
	boolean deleteByMobile(String Mobile);
	
	boolean  existsByMobile(String Mobile);
	
	
	

}
