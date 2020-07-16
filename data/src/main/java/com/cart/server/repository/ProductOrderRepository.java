package com.cart.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cart.server.model.ProductOrderKey;
import com.cart.server.model.Product_order;
@Repository
public interface ProductOrderRepository extends JpaRepository<Product_order, ProductOrderKey> {

}