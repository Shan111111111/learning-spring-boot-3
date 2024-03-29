package com.shantesh.springboot3.learningspringboot3;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shantesh.springboot3.learningspringboot3.game.GameRunner;
import com.shantesh.springboot3.learningspringboot3.game.MarioGame;
import com.shantesh.springboot3.learningspringboot3.game.PacmanGame;
import com.shantesh.springboot3.learningspringboot3.game.SuperContraGame;

public class AppHelloWorldSpring {
	
	public static void main(String[] args) {
//		Launch a Spring Context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
//		Configure the things that we want Spring to manage --> HelloWorldConfiguration.java
		System.out.println(context.getBean("returnName"));
		System.out.println(context.getBean("returnAge"));
		System.out.println(context.getBean("returnPerson"));
		System.out.println(context.getBean("person2ByMethodcall"));
		System.out.println(context.getBean("person3ByParameters"));
		System.out.println(context.getBean("customAddressName"));
		System.out.println(context.getBean(Address.class));
		
//		System.out.println
		Arrays.stream(context.getBeanDefinitionNames())
		.forEach(System.out::println);
	}

}
