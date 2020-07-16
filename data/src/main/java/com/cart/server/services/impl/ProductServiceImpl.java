package com.cart.server.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cart.server.model.Products;
import com.cart.server.repository.OrderRepository;
import com.cart.server.repository.ProductOrderRepository;
import com.cart.server.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl {
	
	@Autowired
	ProductRepository productRepository;
	@Autowired
	OrderRepository orderRepository;
	@Autowired
	ProductOrderRepository productOrderRepository;
	
	public List<Products> getAllProducts(){
		
		List<Products> blog = productRepository.findAll();
		return blog;
	}
}
