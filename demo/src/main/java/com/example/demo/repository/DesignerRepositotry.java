package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Designer;

public interface DesignerRepositotry extends JpaRepository<Designer, Integer> {
		
			//Designer-It's an entity;
	//T - model name = Buyer.java
	//ID - model id name - integer

}
