package com.shantesh.springboot3.learningspringboot3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@GetMapping("/")
	public String returnResponse() {
		return "this is Course from the rest controller";
	}
}
