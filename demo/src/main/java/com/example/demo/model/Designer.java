

package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Designer")
public class Designer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="designer_id")
	private int designer_id;
	@Column(name="designer_name")
	private String designer_name;
	@Column(name="designer_location")
	private String designer_location;
	
	public int getDesigner_id() {
		return designer_id;
	}
	public void setDesigner_id(int designer_id) {
		this.designer_id = designer_id;
	}
	public String getDesigner_name() {
		return designer_name;
	}
	public void setDesigner_name(String designer_name) {
		this.designer_name = designer_name;
	}
	public String getDesigner_location() {
		return designer_location;
	}
	public void setDesigner_location(String designer_location) {
		this.designer_location = designer_location;
	}
	public Designer(int designer_id, String designer_name, String designer_location) {
		super();
		this.designer_id = designer_id;
		this.designer_name = designer_name;
		this.designer_location = designer_location;
	}
	public Designer() {
		super();
		// TODO Auto-generated constructor stub
	}
		
}
