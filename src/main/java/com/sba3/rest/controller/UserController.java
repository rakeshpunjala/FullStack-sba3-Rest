package com.sba3.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sba3.rest.entity.User;
import com.sba3.rest.exception.Exeption;
import com.sba3.rest.service.Userservice;

@RestController
@RequestMapping({"/users"})
public class UserController {
	
	@Autowired
	private Userservice userservice;
	
	@GetMapping(produces = "application/json")
	public List<User> allUsers() throws Exeption {
		return userservice.getAllUsers();
	}
	
	@PostMapping
	public User addUser(@RequestBody User user) throws Exeption {	
	return userservice.add(user);	
	}

}
