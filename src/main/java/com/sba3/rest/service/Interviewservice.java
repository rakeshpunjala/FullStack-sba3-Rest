package com.sba3.rest.service;

import java.util.List;

import com.sba3.rest.entity.Interview;
import com.sba3.rest.entity.User;
import com.sba3.rest.exception.Exeption;

public interface Interviewservice {

	Interview add(Interview interview) throws Exeption;
	Interview save(Interview interview) throws Exeption;
	Interview searchInterview(String customerinput) throws Exeption;
	
	boolean deleteInterview(int inid) throws Exeption;
	
	boolean deleteByMobile(String Mobile);
	
	Interview getInterview(int inid) throws Exeption;
	List<Interview> getAllInterviews() throws Exeption;
	
}
