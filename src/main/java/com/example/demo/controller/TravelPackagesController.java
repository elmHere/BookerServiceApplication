package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
// this saves a list of travel packages
// this is working now after forever
		@PostMapping
		public List<TravelPackage> createTravelPackage(@RequestBody List<TravelPackage> travelPackages){
			return travelPackageService.saveTravelPackage(travelPackages);
		}
	
///displays a list of travel package
/// this works fine
	@GetMapping
	public List<TravelPackage> getTravelPackage() {
		return travelPackageService.findAll();	
	}
	
/// delete customer using an ID List
/// JSON is returning an error here i dont know why
	@DeleteMapping
	public List<Integer> deleteTravelPackages(@RequestParam (value = "ids", required = false) List<Integer> ids){
		travelPackageService.deleteTravelPackage(ids);
		return ids;	
	}
	
	
	
}