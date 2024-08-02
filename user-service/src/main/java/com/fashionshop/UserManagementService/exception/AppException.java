package com.fashionshop.UserManagementService.exception;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.time.Instant;

@Getter

public class AppException extends RuntimeException {
	private final String message;
	private final int status;
	private final String timestamp;
	private final String path;
	private final String data;
	
	public AppException(String message, HttpStatus status, String timestamp, String path, String data) {
		this.message = message;
		this.status = status.value();
		this.path = path;
		this.data = data;
		this.timestamp = Instant.now().toString();
	}
	
	public AppException(String message, HttpStatus status, String path, String data) {
		this(message, status, Instant.now().toString(), data, path);
	}
}