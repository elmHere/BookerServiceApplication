package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.model.Feedback;
import com.example.demo.model.Image;
import com.example.demo.repo.ImageRepository;


public class ImageService {
	
	private ImageRepository imagesRepository;
//	private ServiceService serviceService;
	
	
	public ImageService(ImageRepository imagesRepository) {
		super();
		this.imagesRepository = imagesRepository;
//		this.serviceService = serviceService;
	}
	
	public Image findById(int ImageId) {
		return imagesRepository.findById(ImageId).get();
	}
	
	public Image save(Image image) {
		return imagesRepository.save(image);
	}

}