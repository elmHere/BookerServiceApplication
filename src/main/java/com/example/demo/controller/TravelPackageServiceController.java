package com.example.demo.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repo.ServiceRepository;
import com.example.demo.repo.TravelPackageRepository;

@RestController
@RequestMapping("/travel-packages/{travelPackageId}/services")
public class TravelPackageServiceController {
	
	private TravelPackageRepository travelPackageRepository;
	private ServiceRepository serviceRepository;
	
	public TravelPackageServiceController(TravelPackageRepository travelPackageRepository, ServiceRepository serviceRepository) {
		super();
		this.travelPackageRepository = travelPackageRepository;
		this.serviceRepository = serviceRepository;
	}
	
	@Transactional
	@GetMapping
	public List<com.example.demo.model.Service> getServices(@PathVariable("travelPackageId") int id){
		return travelPackageRepository.findById(id).get().getAvailableServiceList();		
	}
	

}