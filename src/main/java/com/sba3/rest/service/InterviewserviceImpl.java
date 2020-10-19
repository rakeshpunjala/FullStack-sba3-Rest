package com.sba3.rest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sba3.rest.dao.InterviewRepo;
import com.sba3.rest.dao.UserRepo;
import com.sba3.rest.entity.Interview;
import com.sba3.rest.entity.User;
import com.sba3.rest.exception.Exeption;

import net.bytebuddy.implementation.bytecode.Throw;

@Service
public class InterviewserviceImpl implements Interviewservice{
    
	@Autowired
	private InterviewRepo ir;
	
	@Override

	public Interview add(Interview interview) throws Exeption {
	ir.save(interview);
		/*
		 * if(ir.existsById(interview.getInId())) { throw new
		 * Exeption("Interview already exists"); }else { ir.save(interview); }
		 */
	return interview;
	}

	@Override
	public Interview save(Interview interview) throws Exeption {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Interview searchInterview(String customerinput) throws Exeption {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteInterview(int inid) throws Exeption {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteByMobile(String Mobile) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Interview getInterview(int inid) throws Exeption {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Interview> getAllInterviews() throws Exeption {
		// TODO Auto-generated method stub
		return ir.findAll();
	}
 
   

}
