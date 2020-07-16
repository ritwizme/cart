package com.cart.server.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="ORDERS_USER")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order_person {
	 @EmbeddedId
	 private OrderPersonKey id;
	 @Column(name="userAdd")
	 Integer usrAdd;
	 @Column(name="stmpAdd")
	 LocalDateTime stmpAdd;
	 @Column(name="usrUpd")
	 Integer usrUpd;
	 @Column(name="stmpUpd")
	 LocalDateTime stmpUpd;
}
