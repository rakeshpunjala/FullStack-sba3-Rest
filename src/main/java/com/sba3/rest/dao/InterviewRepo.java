package com.sba3.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sba3.rest.entity.Interview;

public interface InterviewRepo extends JpaRepository<Interview, Integer> {
	


}
