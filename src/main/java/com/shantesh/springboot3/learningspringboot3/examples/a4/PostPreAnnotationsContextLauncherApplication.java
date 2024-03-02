package com.shantesh.springboot3.learningspringboot3.examples.a4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {
	SomeDependency someDependency;

	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("..........All dependencies are ready.......");
	}

	@PostConstruct
	public void initialize() {
		System.out.println("some initialization logic ======>>>>>>>>");
		someDependency.getReady();
	}

	@PostConstruct
	public void initialize2() {
		System.out.println("some initialization logic >>>>>>>>");
		someDependency.getReady();
	}

	@PreDestroy
	public void cleanUp() {
		System.out.println("some clean Up logic <----->");
	}
}

@Component
class SomeDependency {

	public void getReady() {
		System.out.println("some logic using/in SomeDependency");
	}

}

@Configuration
@ComponentScan
public class PostPreAnnotationsContextLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(PostPreAnnotationsContextLauncherApplication.class)) {

		}

	}

}
