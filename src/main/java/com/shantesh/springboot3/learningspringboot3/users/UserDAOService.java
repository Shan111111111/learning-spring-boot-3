package com.shantesh.springboot3.learningspringboot3.users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDAOService {

	private static List<User> users= new ArrayList<User>();

	private static Integer idCounter = 0;
	
	static {
		users.add(new User(idCounter++, "Dacid", LocalDate.now().minusYears(30)));
		users.add(new User(idCounter++, "Maria", LocalDate.now().minusYears(25)));
		users.add(new User(idCounter++, "Mariena", LocalDate.now().minusYears(14)));
	}
	
	public List<User> findAll(){
		return users;
	}

	public User findUserbyId(int id) {
		
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().get();
		
	}

	public User save(User user) {
		user.setId(idCounter++);
		users.add(user);
		return user;
	}
}
