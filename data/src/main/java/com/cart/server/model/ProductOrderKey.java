package com.cart.server.model;

import java.io.Serializable;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductOrderKey implements Serializable {
	@Column(name = "OrderId")
	private Integer orderId;
	@Column(name = "ProductId")
	private Integer productId;
}
