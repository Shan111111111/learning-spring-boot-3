package com.shantesh.springboot3.learningspringboot3.users.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomisedExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<CustomisedException> handleAllException(Exception ex, WebRequest request) throws Exception {
		
		CustomisedException customisedException = new CustomisedException(ex.getMessage(), request.getDescription(false), LocalDateTime.now());
		return new ResponseEntity<CustomisedException>(customisedException, HttpStatus.INTERNAL_SERVER_ERROR);

	}
	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<CustomisedException> handleUserNotFoundException(Exception ex, WebRequest request) throws Exception {
		
		CustomisedException customisedException = new CustomisedException(ex.getMessage(), request.getDescription(false), LocalDateTime.now());
		return new ResponseEntity<CustomisedException>(customisedException, HttpStatus.NOT_FOUND);
		
	}
	
	
	@Override
	public ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
		
		CustomisedException customisedException = new CustomisedException(ex.getMessage(), request.getDescription(false), LocalDateTime.now());
		return new ResponseEntity<Object>(customisedException, HttpStatus.NOT_FOUND);
	}
}
