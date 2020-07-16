package com.cart.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cart.server.model.Products;
@Repository
public interface ProductRepository extends JpaRepository<Products, Integer> {

}