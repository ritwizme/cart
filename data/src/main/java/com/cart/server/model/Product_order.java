package com.cart.server.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="product_order")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product_order {
	@EmbeddedId
	private ProductOrderKey id;
	@Column(name = "Name")
	private String name;
	@Column(name = "available_quantity")
	private Integer addedQuantity;
	@Column(name = "price")
	private Integer price;
	@Column(name = "description")
	private String description;
}
