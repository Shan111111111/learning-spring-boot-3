package com.shantesh.springboot3.learningspringboot3.users.exception;

import java.time.LocalDateTime;

public class CustomisedException{

	private String message;
	private String detail;
	private LocalDateTime timeStamp;

	public CustomisedException(String message, String detail, LocalDateTime timeStamp) {
		super();
		this.message = message;
		this.detail = detail;
		this.timeStamp = timeStamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "CutomisedException [message=" + message + ", detail=" + detail + ", timeStamp=" + timeStamp + "]";
	}

}
