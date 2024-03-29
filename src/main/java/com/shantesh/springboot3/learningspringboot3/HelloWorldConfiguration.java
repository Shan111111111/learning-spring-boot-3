package com.shantesh.springboot3.learningspringboot3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {};
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
		var person = new Person("Ravi", 20 , new Address("manual creation by new keyword", "manual creation by new keyword"));
		return person;
	}
	@Bean
	public Person person2ByMethodcall() {
		var person = new Person(returnName(), returnAge(), returnAddress());
		return person;
	}
	@Bean
	public Person person3ByParameters(String name, int age, @Qualifier("takeThis")Address faf) {
		var person = new Person(name, age, faf);
		return person;
	}
	@Bean(name = "customAddressName")
	@Primary
	public Address returnAddress() {
		var address = new Address("Ecity", "Bangalore");
		return address;
	}
	@Bean(name = "customAddressName2")
	@Qualifier("takeThis")
	public Address returnAddress2() {
		var address = new Address("Soraba", "Chickpet");
		return address;
	}
	
	
}
