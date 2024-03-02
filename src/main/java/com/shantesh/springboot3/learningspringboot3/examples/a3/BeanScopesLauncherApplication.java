package com.shantesh.springboot3.learningspringboot3.examples.a3;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class NormalClass {

}

@Component
class PrototypeClass {

}

@Configuration
@ComponentScan
public class BeanScopesLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

		}

	}

}
