package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Image;
import com.example.demo.repo.ServiceRepository;


public class ServiceService {
	
	private ServiceRepository serviceRepository;
//	private ImageService imageService;

	
	public ServiceService(ServiceRepository serviceRepository) {
		super();
		this.serviceRepository = serviceRepository;
//		this.imageService = imageService;
	}
	
	

	public com.example.demo.model.Service save(com.example.demo.model.Service service) {
		return serviceRepository.save(service);
	}

}

