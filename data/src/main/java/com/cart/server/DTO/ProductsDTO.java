package com.cart.server.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductsDTO {
	   private Integer id;
	   private String name;
	   private Integer available_quantity;
	   private Integer price;
	   private String description;
}
