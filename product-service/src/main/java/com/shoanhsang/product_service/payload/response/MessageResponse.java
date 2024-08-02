package com.shoanhsang.product_service.payload.response;


public record MessageResponse(String message, int status, String timestamp, String path, Object data) {
}
