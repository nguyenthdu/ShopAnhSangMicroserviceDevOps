package com.fashionshop.UserManagementService.payload.response;


public record MessageResponse(String message, int status, String timestamp, String path, Object data) {
}
