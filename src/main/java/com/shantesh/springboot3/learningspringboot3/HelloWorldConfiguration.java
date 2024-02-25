package com.shantesh.springboot3.learningspringboot3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String returnName() {
		return "you are seeing the Bean value";
	}
	@Bean
	public int returnAge() {
		return 12222;
	}
	@Bean
	public Person returnPerson() {
		var person = new Person("Ravi", 20);
		return person;
	}
	
}
