package com.shoanhsang.product_service.model;

import jakarta.persistence.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.engine.jdbc.Size;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	private String code;
	private String name;
	private String description;
	private String image;
	@Enumerated(EnumType.STRING)
	private ESize size;
	@Enumerated(EnumType.STRING)
	private ESeasion seasion;
	private double price;
	private int quantity;
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	private LocalDateTime createdAt;
}
