package com.cart.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cart.server.DTO.GetOrderDTO;
import com.cart.server.DTO.SaveOrderDTO;
import com.cart.server.model.Products;
import com.cart.server.services.impl.OrderServiceImpl;
import com.cart.server.services.impl.ProductServiceImpl;

@RestController
@RequestMapping(value = "/")
@CrossOrigin
public class DataController {
	@Autowired
	OrderServiceImpl orderServiceImpl;
	@Autowired
	ProductServiceImpl productServiceImpl;
	
	@RequestMapping(value = "/createOrder", method = RequestMethod.POST)
	@ResponseBody
	public String saveOrder(@RequestBody SaveOrderDTO saveOrderDTO) {
		System.out.print(saveOrderDTO.toString());
		orderServiceImpl.createOrder(saveOrderDTO);

		return "Order placed successfully";
	}

	
	@RequestMapping(value = "/getProducts", method = RequestMethod.GET)
	public List<Products> getProducts() {
		List<Products> blog = orderServiceImpl.getAllProducts();
		return blog;
	}

	@RequestMapping(value = "/getOrders", method = RequestMethod.GET)
	public List<GetOrderDTO> getOrders() {
		List<GetOrderDTO> orders = orderServiceImpl.getAllOrders();
		return orders;
	}
	
}
