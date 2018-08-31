package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.model.TravelPackage;
import com.example.demo.repo.TravelPackageRepository;

public class TravelPackageService {
	
	private TravelPackageRepository travelPackageRepository;
	private ServiceService serviceService;
	private ImageService imageService;
	
	public TravelPackageService(TravelPackageRepository travelPackageRepository, ServiceService serviceService
			,ImageService imageService) {
		super();
		this.travelPackageRepository = travelPackageRepository;
		this.serviceService = serviceService;
		this.imageService = imageService;
	}

	@Transactional
	public List<TravelPackage> findAll() {
		return (List<TravelPackage>) travelPackageRepository.findAll();
	}
	
	@Transactional
	public TravelPackage findById(int travelPackageId) {
		return travelPackageRepository.findById(travelPackageId).get();
	}
	

	@Transactional
	public List<TravelPackage> saveTravelPackage(List<TravelPackage> travelPackage) {
		return (List<TravelPackage>) travelPackageRepository.saveAll(travelPackage);
	}
	
	/// deletes a list of travel packages
	@Transactional
	public void deleteTravelPackage(List<Integer> travelPackageIds) {
		for (Integer travelPackId : travelPackageIds ) {
			travelPackageRepository.deleteById(travelPackId);
		}
	}
	
	
	
	
}