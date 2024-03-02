package com.shantesh.springboot3.learningspringboot3.examples.exercise;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ExerciseLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(ExerciseLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

		}

	}

}
