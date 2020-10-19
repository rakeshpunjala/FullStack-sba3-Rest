package com.sba3.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sba3.rest.entity.Interview;
import com.sba3.rest.entity.User;

public interface InterviewRepo extends JpaRepository<Interview, Integer> {
	
	
	/*
	 * Interview findByEmail(String email);
	 * 
	 * Interview findByMobile(String mobile);
	 * 
	 * Interview findByUserId(Integer userId);
	 * 
	 * boolean deleteByMobile(String Mobile);
	 * 
	 * boolean existsByMobile(String Mobile);
	 * 
	 * boolean existsByMobile(String Mobile);
	 */
	 

}
