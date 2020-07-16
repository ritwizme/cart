package com.cart.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cart.server.model.Orders;
@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer> {

}