package com.shantesh.springboot3.learningspringboot3.examples.exercise;

import java.util.Arrays;
import java.util.OptionalInt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
interface DataService{
	int[] retrieveData();
}
@Component
@Primary
class MongoDataService implements DataService{
	public int[] retrieveData() {
		System.out.println("in MongoDataService...");
		return new int[] {11, 22, 33, 44};
	}
}
@Component
class MYSQLDataService implements DataService{
	public int[] retrieveData() {
		System.out.println("in MYSQLDataService...");
		return new int[] {111, 222, 333, 444};
	}
}

@Component
class BusinessCalculationService {
	@Autowired
	DataService dataService;
	
	public OptionalInt findMax() {
		return Arrays.stream(dataService.retrieveData()).max();
	}
	
}


@Configuration
@ComponentScan
public class ExerciseLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(ExerciseLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			
			System.out.println(context.getBean(BusinessCalculationService.class));
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}

	}

}
