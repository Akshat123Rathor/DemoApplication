package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Designer;
import com.example.demo.repository.DesignerRepositotry;

@Service
public class DesignerServices {
	
	@Autowired
	private DesignerRepositotry designerRepositotry;
	
	//save data
	public Designer SaveDesigner(Designer designer) {
		
		return designerRepositotry.save(designer);
		
	}
	// read data
	public List<Designer> DesignerDetails() {
		
		return designerRepositotry.findAll();
	}

}
