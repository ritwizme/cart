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
@Table(name="ORDERS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name="Id")
   private Integer id;
   @Column(name="Person")
   private Integer personId;
   
}