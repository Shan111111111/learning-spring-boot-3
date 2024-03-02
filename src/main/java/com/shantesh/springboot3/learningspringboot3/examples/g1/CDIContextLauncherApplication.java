package com.shantesh.springboot3.learningspringboot3.examples.g1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
class BusinessService {
	private DataService dataService;

	@Inject
	public void setDataService(DataService dataService) {
		System.out.println("setter injection....");
		this.dataService = dataService;
	}

	public DataService getDataService() {
		return dataService;
	}

}

@Named
class DataService {

}

@Configuration
@ComponentScan
public class CDIContextLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(CDIContextLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			System.out.println(context.getBean(BusinessService.class));
			System.out.println(context.getBean(BusinessService.class).getDataService());
		}

	}

}


