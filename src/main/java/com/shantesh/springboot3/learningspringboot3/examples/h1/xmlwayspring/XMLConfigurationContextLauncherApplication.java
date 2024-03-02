package com.shantesh.springboot3.learningspringboot3.examples.h1.xmlwayspring;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLConfigurationContextLauncherApplication {
	
	public static void main(String[] args) {

		try (var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean("nameofBeanOrReference"));
		}

	}

}


