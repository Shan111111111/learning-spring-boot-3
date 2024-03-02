package com.shantesh.springboot3.learningspringboot3.examples.a2;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component
class ClassA{

	
}
@Component
class ClassB{
	ClassA classA;
	
	public ClassB(ClassA classA ) {
		this.classA = classA;
	}
}



@Configuration
@ComponentScan
public class LazyinitializationLauncherApplication {
	

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(LazyinitializationLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

		}

	}

}


