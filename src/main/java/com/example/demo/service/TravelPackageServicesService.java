package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import com.example.demo.model.TravelPackage;
import com.example.demo.repo.TravelPackageRepository;

public class TravelPackageServicesService {
	
	private TravelPackageRepository travelPackageRepository;
	private ServiceService serviceService;
	private ImageService imageService;
	
	public TravelPackageServicesService(TravelPackageRepository travelPackageRepository, ServiceService serviceService,
			ImageService imageService) {
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
	

}
