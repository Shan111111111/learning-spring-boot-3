package com.shantesh.springboot3.learningspringboot3.examples.a4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class PostPreAnnotationsContextLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(PostPreAnnotationsContextLauncherApplication.class)) {

		}

	}

}
