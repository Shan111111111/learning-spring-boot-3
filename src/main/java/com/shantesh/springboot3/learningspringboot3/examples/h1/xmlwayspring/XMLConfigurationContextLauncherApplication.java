package com.shantesh.springboot3.learningspringboot3.examples.h1.xmlwayspring;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shantesh.springboot3.learningspringboot3.game.GameRunner;

public class XMLConfigurationContextLauncherApplication {
	
	public static void main(String[] args) {

		try (var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean("nameofBeanOrReference"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("pacmanGame"));
			System.out.println(context.getBean("gameRunner"));
			context.getBean(GameRunner.class).run();
			
		}

	}

}

