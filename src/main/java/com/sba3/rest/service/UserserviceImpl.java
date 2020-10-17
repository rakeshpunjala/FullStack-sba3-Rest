package com.sba3.rest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sba3.rest.dao.UserRepo;
import com.sba3.rest.entity.User;
import com.sba3.rest.exception.Exeption;

@Service
public class UserserviceImpl implements Userservice{
 
    @Autowired
	private UserRepo ur;
	
	@Override
	@Transactional
	public User add(User user) throws Exeption {
    
	if(ur.existsById(user.getUserId()))	{
	throw new Exeption("User already exists");		
	}
	if(ur.existsByMobile(user.getMobile())) {
	throw new Exeption("User already exists");	
	}
	ur.save(user);
	
	return user;
	}

	@Override
	public User save(User contact) throws Exeption {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User searchUser(String customerinput) throws Exeption {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public List<User> getAllUsers() throws Exeption {
	
		
	System.out.println(ur.findAll()); 
		
	return ur.findAll();
	}

	@Override
	public boolean deleteUser(int userId) throws Exeption {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getUser(int userId) throws Exeption {
		// TODO Auto-generated method stub
		return null;
	}

}
