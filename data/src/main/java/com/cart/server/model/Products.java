package com.cart.server.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="PRODUCTS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name="Id")
   private Integer id;
   @Column(name="Name")
   private String name;
   @Column(name="available_quantity")
   private Integer available_quantity;
   @Column(name="price")
   private Integer price;
   @Column(name="description")
   private String description;

   
}