package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TravelPackage;
import com.example.demo.service.TravelPackageService;

@RestController
@RequestMapping("/travel-packages")
public class TravelPackagesController {
	
	private TravelPackageService travelPackageService;
	
	public TravelPackagesController(TravelPackageService travelPackageService) {
		super();
		this.travelPackageService = travelPackageService;
	}
	
	
	
	@GetMapping
	public List<TravelPackage> getTravelPackage() {
		return travelPackageService.findAll();
		
	}
	
	
	
	
	
}