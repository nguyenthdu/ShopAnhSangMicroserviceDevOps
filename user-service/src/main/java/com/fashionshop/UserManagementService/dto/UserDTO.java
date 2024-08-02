package com.fashionshop.UserManagementService.dto;

import lombok.Data;

@Data
public class UserDTO {
	private String id;
	private String code;
	private String name;
	private int age;
	private String address;
	private String role;
	private String email;
}
