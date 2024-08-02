package com.shoanhsang.product_service.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ProductDTO {
	private String id;
	private String code;
	private String name;
	private String description;
	private String image;
	private String size;
	private String seasion;
	private double price;
	private int quantity;
	private String categoryId;
	private LocalDateTime createdAt;
}
