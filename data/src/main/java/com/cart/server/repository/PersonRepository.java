package com.cart.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cart.server.model.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}