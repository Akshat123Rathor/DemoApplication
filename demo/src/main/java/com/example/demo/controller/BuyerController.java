package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Buyer;
import com.example.demo.services.BuyerService;


@RestController
public class BuyerController {
	
	
	@Autowired
	private BuyerService buyerService;
	
	
	@RequestMapping(value="/BuyerDetails",method=RequestMethod.GET)
	public List<Buyer> BuyerDetails() {
		
		
		return buyerService.BuyersDetails();
	}
	@RequestMapping(value="/buyer", method=RequestMethod.POST)
	public Buyer saveBuyer(@RequestBody Buyer buyer ) {
		return buyerService.saveBuyer(buyer);
	}
	
	

}
