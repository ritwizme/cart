package com.cart.server.DTO;

import java.util.List;

import com.cart.server.model.Product_order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetOrderDTO {
	private Integer userId;
	private Integer orderId;
	private List<Product_order> products;
}