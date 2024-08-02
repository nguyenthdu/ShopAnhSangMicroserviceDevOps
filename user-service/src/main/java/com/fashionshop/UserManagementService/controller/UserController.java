package com.fashionshop.UserManagementService.controller;

import com.fashionshop.UserManagementService.payload.request.SignUp;
import com.fashionshop.UserManagementService.payload.response.MessageResponse;
import com.fashionshop.UserManagementService.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping()
	ResponseEntity<MessageResponse> createUser(@RequestBody SignUp signUp) {
		try {
			return ResponseEntity.ok(new MessageResponse("User created successfully", 200, Instant.now().toString(), "/api/v1/user", 			userService.createUser(signUp)));
		} catch (Exception e) {
			return ResponseEntity.status(500).body(new MessageResponse(e.getMessage(), 500, Instant.now().toString(), "/api/v1/user", null));
		}
	}
	//	@GetMapping("/{id}")
	//	ResponseEntity<MessageResponse> getUserById(@PathVariable String id) {
	//		try {
	//			return ResponseEntity.ok(new MessageResponse("User found", 200, Instant.now().toString(), "/api/v1/user/" + id, userService.getUserById(id)));
	//		} catch (Exception e) {
	//			return ResponseEntity.status(500).body(new MessageResponse(e.getMessage(), 500, Instant.now().toString(), "/api/v1/user/" + id, null));
	//		}
	//	}
}
