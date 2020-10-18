package com.sba3.rest.service;

import java.util.List;


import com.sba3.rest.entity.User;
import com.sba3.rest.exception.Exeption;

public interface Userservice {
	
	User add(User user) throws Exeption;
	User save(User user) throws Exeption;
	User searchUser(String customerinput) throws Exeption;
	
	boolean deleteUser(int userId) throws Exeption;
	
	boolean deleteByMobile(String Mobile);
	
	User getUser(int userId) throws Exeption;
	List<User> getAllUsers() throws Exeption;

}
