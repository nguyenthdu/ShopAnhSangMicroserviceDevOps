package com.fashionshop.UserManagementService.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	private String code;
	private String name;
	private int age;
	private String address;
	@Enumerated(EnumType.STRING)
	private Role role;
	private String email;
	private String password;
}
