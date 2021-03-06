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
	public User save(User user) throws Exeption {
	if(ur.existsById(user.getUserId()))	{
	ur.save(user);		
	}else {
	throw new Exeption("User doesn't exists");		
	}
	return user;
	}

	@Override
	public User searchUser(String customerinput) throws Exeption {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public List<User> getAllUsers() throws Exeption {
	
	
	return ur.findAll();
	}

	@Override
	@Transactional
	public boolean deleteUser(int userId) throws Exeption {
		// TODO Auto-generated method stub
		ur.deleteById(userId);		
		return true;
	}
	
	
	@Transactional
	public boolean deleteUserbyMobile(String mobile) throws Exeption {
		// TODO Auto-generated method stub
		ur.deleteByMobile(mobile);	
		return true;
	}
	
	

	@Override
	public User getUser(int userId) throws Exeption {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteByMobile(String Mobile) {
		// TODO Auto-generated method stub
		return false;
	}

}
