package com.fashionshop.UserManagementService.service;

import com.fashionshop.UserManagementService.dto.UserDTO;
import com.fashionshop.UserManagementService.payload.request.SignUp;

public interface UserService {
	UserDTO createUser(SignUp signUp);
	UserDTO getUserById(String id);
}
