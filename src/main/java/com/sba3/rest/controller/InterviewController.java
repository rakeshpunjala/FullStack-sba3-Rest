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

import com.sba3.rest.entity.Interview;
import com.sba3.rest.entity.User;
import com.sba3.rest.exception.Exeption;
import com.sba3.rest.service.Interviewservice;
import com.sba3.rest.service.Userservice;


@RestController
@RequestMapping({"/interviews"})
public class InterviewController {
	
	@Autowired
	private Interviewservice interviewservice;
	
	@GetMapping(produces = "application/json")
	public List<Interview> allInterviews() throws Exeption {
		return interviewservice.getAllInterviews();
	}
	
	
	  @PostMapping
	  public Interview addInterview(@RequestBody Interview interview) throws Exeption {
	  return interviewservice.add(interview); 
	  }
	 
	
	
	  @PostMapping("/update") 
	  public Interview updateUser(@RequestBody Interview interview) throws Exeption { 
	  return interviewservice.save(interview); 
	  }
	  
	  @DeleteMapping("/delete/{id}") 
	  public Interview deleteuser(@PathVariable int id) throws Exeption { 
	Interview deletedInterview = null; 
	  List<Interview> allinterviews =interviewservice.getAllInterviews(); 
	  for (Interview interview : allinterviews) { 
	  if(interview.getInId().equals(id)) { 
	  interviewservice.deleteInterview(id);
	  deletedInterview = interview;
	  break; 
	  } 
	  } 
	  return deletedInterview; 
	  }
	 
	
	
	/*
	 * @DeleteMapping("/delete/{id}") public User deleteuser(@PathVariable int id)
	 * throws Exeption { User deletedUser = null; List<User> allusers
	 * =interviewservice.getAllUsers(); for (User user : allusers) {
	 * if(user.getUserId().equals(id)) { interviewservice.deleteUser(id);
	 * deletedUser = user; break; } } return deletedUser; }
	 */
	  
	  
	 

}
