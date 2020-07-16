package com.cart.server.services.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cart.server.DTO.GetOrderDTO;
import com.cart.server.DTO.SaveOrderDTO;
import com.cart.server.model.Orders;
import com.cart.server.model.ProductOrderKey;
import com.cart.server.model.Product_order;
import com.cart.server.model.Products;
import com.cart.server.repository.OrderRepository;
import com.cart.server.repository.ProductOrderRepository;
import com.cart.server.repository.ProductRepository;

@Service
@Transactional
public class OrderServiceImpl {
	
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
	
	public Orders saveOrder(Orders order) {
		Orders savedOrder = orderRepository.save(order);
		return savedOrder;
	}

	public void createOrder(SaveOrderDTO saveOrderDTO) {
		Orders o = new Orders();
		o.setPersonId(saveOrderDTO.getUserId());
		Orders savedOrder = orderRepository.save(o);
		
		for(Products pr : saveOrderDTO.getOrders()) {
			ProductOrderKey productOrderKey = new ProductOrderKey();
			productOrderKey.setOrderId(savedOrder.getId());
			productOrderKey.setProductId(pr.getId());
			Product_order po = new Product_order();
			po.setId(productOrderKey);
			po.setDescription(pr.getDescription());
			po.setAddedQuantity(pr.getAvailable_quantity());
			po.setName(pr.getName());
			po.setPrice(pr.getPrice());
			productOrderRepository.save(po);
		}
		
	}

	public List<GetOrderDTO> getAllOrders() {
		// TODO Auto-generated method stub
		List<Orders> orders = orderRepository.findAll();
		List<Product_order> products = productOrderRepository.findAll(); 
		
		Map<Integer, List<Product_order>> orderProductMap = new HashMap<>();
		for(Product_order prod : products) {
			if(orderProductMap.containsKey(prod.getId().getOrderId())) {
				List<Product_order> existingOrder = orderProductMap.get(prod.getId().getOrderId());
				existingOrder.add(prod);
				orderProductMap.replace(prod.getId().getOrderId(),existingOrder);
			}
			else {
				List<Product_order> order = new ArrayList<>();
				order.add(prod);
				orderProductMap.put(prod.getId().getOrderId(), order);
			}
		}
		
		
		List<GetOrderDTO> orderList = new ArrayList<>();
		for(Orders o : orders) {
			GetOrderDTO getOrderDTO = new GetOrderDTO();
			getOrderDTO.setOrderId(o.getId());
			getOrderDTO.setUserId(1);
			getOrderDTO.setProducts(orderProductMap.get(o.getId()));
			orderList.add(getOrderDTO);
		}
		return orderList;
	}
}
