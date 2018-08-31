package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.repo.CustomerRepository;
import com.example.demo.repo.TravelPackageRepository;
import com.example.demo.service.CustomerService;
import com.example.demo.service.ImageService;
import com.example.demo.service.ServiceService;
import com.example.demo.service.TravelPackageService;

@Configuration
public class BookerServiceConfig {

	@Bean
	public CustomerService customerService(CustomerRepository customerRepository) {
		return new CustomerService(customerRepository);

	}

	@Bean
	public TravelPackageService travelPackageService(TravelPackageRepository travelPackageRepository,
			ServiceService serviceService, ImageService imageService) {
		return new TravelPackageService(travelPackageRepository, serviceService, imageService);
	}

}
