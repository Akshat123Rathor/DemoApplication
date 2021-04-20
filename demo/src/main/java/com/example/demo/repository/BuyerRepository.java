package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Buyer;

@Repository
public interface BuyerRepository extends JpaRepository<Buyer, Integer> {
 
	
	// T - model name = Buyer.java
	
	// ID - model id name - int

}
