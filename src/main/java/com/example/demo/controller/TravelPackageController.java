package com.example.demo.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@PutMapping("/{travelPackageId}")
	public TravelPackage updateTravelPackage(@PathVariable("travelPackageId") int travelPackageId, @RequestBody TravelPackage travelPackage) {
		travelPackage.setTravelPackageId(travelPackageId);
		return travelPackageService.saveTravelPackage(travelPackage);
		
	}

	@DeleteMapping("/{travelPackageId}")
	public Integer deleteTravelPackage(@PathVariable("travelPackageId") int travelPackageId){
		travelPackageService.deleteTravelPackage(travelPackageId);
		return travelPackageId;	
	}
	
	
	
}
