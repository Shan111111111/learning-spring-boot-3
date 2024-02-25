package com.shantesh.springboot3.learningspringboot3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
}
