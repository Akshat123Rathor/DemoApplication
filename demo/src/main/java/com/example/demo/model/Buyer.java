package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="BUYER")
public class Buyer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="BUYER_ID")
	private int buyerID ;
	@Column(name="NAME")
	private String name ;
	@Column(name="LOCATION")
	private String location ;
	
	
	public int getBuyerID() {
		return buyerID;
	}
	public void setBuyerID(int buyerID) {
		this.buyerID = buyerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Buyer(int buyerID, String name, String location) {
		super();
		this.buyerID = buyerID;
		this.name = name;
		this.location = location;
	}
	public Buyer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
