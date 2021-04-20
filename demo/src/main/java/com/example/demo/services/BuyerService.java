package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Buyer;
import com.example.demo.repository.BuyerRepository;

@Service
public class BuyerService {

	
	@Autowired
	private BuyerRepository buyerRepository ;
	
	// save a data

	public Buyer saveBuyer(Buyer buyer) {
	return buyerRepository.save(buyer);
		
	}
	
	// read data
	
	public List<Buyer> BuyersDetails() {
		return buyerRepository.findAll();
		
	}
	
	
	
	
}
