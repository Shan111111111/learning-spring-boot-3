package com.shantesh.springboot3.learningspringboot3.users;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {

	@Autowired
	UserDAOService userDAOService;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userDAOService.findAll();
	}
	
	
	@GetMapping("/users/{id}")
	public User getUser(@PathVariable int id){
		return userDAOService.findUserbyId(id);
	}
	
	@PostMapping("/users")
	public ResponseEntity<User> saveUser(@RequestBody User savedUser){
		userDAOService.save(savedUser);
		
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/ {id}").buildAndExpand(savedUser.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
}
