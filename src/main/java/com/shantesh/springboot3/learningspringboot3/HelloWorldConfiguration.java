package com.shantesh.springboot3.learningspringboot3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};
record Address(String firstLine, String city) {};

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
	@Bean
	public Person person2ByMethodcall() {
		var person = new Person(returnName(), returnAge());
		return person;
	}
	@Bean(name = "customAddressName")
	public Address returnAddress() {
		var address = new Address("Ecity", "Bangalore");
		return address;
	}
	
	
}
