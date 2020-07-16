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
@Table(name="person")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name="Id")
   private Integer id;
   @Column(name="Age")
   private Integer age;
   @Column(name="Occupation")
   private String occupation;
   @Column(name="Phone_Number")
   private String phNo;
   @Column(name="blood_group")
   private String bloodGroup;
   @Column(name="Address")
   private String address;
   @Column(name="Name")
   private String name;
   
}