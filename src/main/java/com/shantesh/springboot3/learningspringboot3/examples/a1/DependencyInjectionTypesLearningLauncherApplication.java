package com.shantesh.springboot3.learningspringboot3.examples.a1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass {
	Dependency1 dependency1;
	Dependency2 dependency2;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Using ---> " + dependency1 + " and " + dependency2;
	}

}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class DependencyInjectionTypesLearningLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(
				DependencyInjectionTypesLearningLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			System.out.println(context.getBean(YourBusinessClass.class));
		}

	}

}
