package com.shoanhsang.product_service.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CategoryDTO {
	private String id;
	private String code;
	private String name;
	private LocalDateTime createdAt;
}
