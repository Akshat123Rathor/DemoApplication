

package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Designer;
import com.example.demo.services.DesignerServices;


@RestController
public class DesignerController {

	@Autowired
	private DesignerServices designersServices;
	
	
	@RequestMapping(value="/DesignerDetails",method=RequestMethod.GET)
	public List<Designer> DetailsDesigner() {
		
		return designersServices.DesignerDetails();
	}
	
	@RequestMapping(value="/designer",method=RequestMethod.POST)
	public Designer SaveDesigner(@RequestBody Designer designer) {
		return designersServices.SaveDesigner(designer);
	}
	
}
