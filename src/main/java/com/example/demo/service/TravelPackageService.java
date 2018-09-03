package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.model.Image;
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
	public List<TravelPackage> saveTravelPackage(List<TravelPackage> travelPackages) {
		//save the list of travel packages to table so that they get assigned a unique id
		List<TravelPackage> travelPacks = (List<TravelPackage>) travelPackageRepository.saveAll(travelPackages);
		
		// for each travel package in the list, get collection of images
		for(TravelPackage travelPack : travelPacks) {
			for(Image image : travelPack.getImages()) {
				// associate the image to the specific travel package
				image.setTravelPackage(travelPack);
				imageService.save(image);	
			}
			
			// for each travel package in the list, get the collection of services availed
			for(com.example.demo.model.Service service : travelPack.getAvailableServiceList()) {
				// associate a service to the current travel package
				service.setTravelPackage(travelPack);
				serviceService.save(service);
				
				// since each service has associated images, we assign the service to these images
				for(Image image1: service.getImages()) {
					image1.setService(service);
					image1.setTravelPackage(travelPack);
					imageService.save(image1);
				}
			}
		}
		return travelPacks;
	}
	
	/// deletes a list of travel packages
	@Transactional
	public void deleteTravelPackage(List<Integer> travelPackageIds) {
		for (Integer travelPackId : travelPackageIds ) {
			travelPackageRepository.deleteById(travelPackId);
		}
	}
	

	
	
}