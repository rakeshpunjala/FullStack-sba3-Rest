package com.sba3.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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
	
	@PostMapping("/update")
	public User updateUser(@RequestBody User user) throws Exeption {		
	return userservice.save(user);
	}
	
	
	  @DeleteMapping("/delete/{id}") 
	  public User deleteuser(@PathVariable int id) throws Exeption { 
	  User deletedUser = null; 
	  List<User> allusers =userservice.getAllUsers(); 
	  for (User user : allusers) { 
	  if(user.getUserId().equals(id)) { 
	  userservice.deleteUser(id);
	  deletedUser = user;
	  break; 
	  } 
	  } 
	  return deletedUser; 
	  }
	  
	  
	 

}
