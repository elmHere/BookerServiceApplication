package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TravelPackage;
import com.example.demo.service.TravelPackageService;

@RestController
@RequestMapping("/travel-packages")
public class TravelPackageController {
	
	private TravelPackageService travelPackageService;
	
	public TravelPackageController(TravelPackageService travelPackageService) {
		super();
		this.travelPackageService = travelPackageService;
	}

	@GetMapping("/{travelPackageId}")
	public TravelPackage getTravelPackage(@PathVariable("travelPackageId") int travelPackageId) {
		return travelPackageService.findById(travelPackageId);
		
	}
	
//	@PutMapping("/{travelPackageId}")
//	public TravelPackage
//	
//	
//	
}
