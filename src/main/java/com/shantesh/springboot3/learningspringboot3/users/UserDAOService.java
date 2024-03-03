package com.shantesh.springboot3.learningspringboot3.users;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDAOService {

	private static List<User> users;

	static {
		users = Arrays.asList(new User(1, "Dacid", LocalDate.now().minusYears(30)), 
							  new User(2, "Maria", LocalDate.now().minusYears(25)),
							  new User(6, "Mariena", LocalDate.now().minusYears(14)));
	}
	
	public List<User> findAll(){
		return users;
	}
}
