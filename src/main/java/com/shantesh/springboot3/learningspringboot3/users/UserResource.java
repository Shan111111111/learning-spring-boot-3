package com.shantesh.springboot3.learningspringboot3.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

	@Autowired
	UserDAOService userDAOService;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userDAOService.findAll();
	}
}
