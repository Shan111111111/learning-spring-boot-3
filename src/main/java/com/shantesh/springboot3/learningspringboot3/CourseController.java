package com.shantesh.springboot3.learningspringboot3;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@GetMapping("/")
	public String returnResponse() {
		return "this is Course from the rest controller";
	}
	
	@GetMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(new Course(3, "sharima", "the man of war"), new Course(3, "Daniel steel", "the neighbours"));
	}
}
