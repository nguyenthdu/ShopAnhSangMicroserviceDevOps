package com.fashionshop.UserManagementService.payload.request;

public record SignUp(String name, int age, String address, String email, String password) {
}
