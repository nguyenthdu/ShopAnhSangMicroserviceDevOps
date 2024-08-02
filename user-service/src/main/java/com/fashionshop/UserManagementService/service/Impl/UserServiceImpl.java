package com.fashionshop.UserManagementService.service.Impl;

import com.fashionshop.UserManagementService.dto.UserDTO;
import com.fashionshop.UserManagementService.model.Role;
import com.fashionshop.UserManagementService.model.User;
import com.fashionshop.UserManagementService.payload.request.SignUp;
import com.fashionshop.UserManagementService.repository.UserRepository;
import com.fashionshop.UserManagementService.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	private final UserRepository userRepository;
	private final ModelMapper modelMapper;
	    private static final Logger logger = LogManager.getLogger(UserServiceImpl.class);

	public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
		this.userRepository = userRepository;
		this.modelMapper = modelMapper;
	}
	private String generateCode() {
		return "U" + System.currentTimeMillis();
	}
	
	@Override
	public UserDTO createUser(SignUp signUp) {
		//record khong nhan modelMapper
		User user = new User();
		user.setCode(generateCode());
		user.setAddress(signUp.address());
		user.setAge(signUp.age());
		user.setEmail(signUp.email());
		user.setPassword(signUp.password());
		user.setName(signUp.name());
		user.setRole(Role.ROLE_USER);
		userRepository.save(user);
		return modelMapper.map(user, UserDTO.class);
		
		
	}
	
	@Override
	public UserDTO getUserById(String id) {
		User user = userRepository.findById(id).orElseThrow();
		return modelMapper.map(user, UserDTO.class);
	}
}
