package com.fashionshop.UserManagementService.exception;


import com.fashionshop.UserManagementService.payload.response.MessageResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {
	@ExceptionHandler(value = AppException.class)
	@ResponseBody
	public ResponseEntity<MessageResponse> handleException(AppException ex) {
		return ResponseEntity.status(ex.getStatus()).body(new MessageResponse(ex.getMessage(), ex.getStatus(), ex.getTimestamp(), ex.getPath(), ex.getData()));//chứa thông tin phản hồi
	}
}