package com.shantesh.springboot3.learningspringboot3.helloworld;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

class HelloWorld {
	private String message;

	public HelloWorld(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorld [message=" + message + "]";
	}

}

@RestController
public class HelloWorldController {
	
	private MessageSource messageSource;

	public HelloWorldController(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@GetMapping("/hello")
	public String helloWorld() {
		return "Hellow World hoooooo";
	}

	@GetMapping("/hello-bean")
	public HelloWorld helloBean() {
		HelloWorld helloWorld = new HelloWorld("Hello World!!!!");
		return helloWorld;
	}

	@GetMapping("/hello-world/path-variable/{name}")
	public HelloWorld helloWorld(@PathVariable String name) {
		HelloWorld helloWorld = new HelloWorld(name);
		return helloWorld;
	}
	@GetMapping("/hello-internationalised")
	public String helloWorldInternational() {
		 Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage("good.morning.message", null, "Default Message", locale);
	}
}
