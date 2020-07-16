package com.cart.server.DTO;

import java.util.ArrayList;

import com.cart.server.model.Products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaveOrderDTO {
   private Integer userId;
   private ArrayList<Products> orders;
}