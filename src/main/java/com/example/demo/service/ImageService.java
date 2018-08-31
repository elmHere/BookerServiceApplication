package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.model.Image;
import com.example.demo.repo.ImageRepository;

@Service
public class ImageService {
	
	private ImageRepository imagesRepository;
	
	public ImageService(ImageRepository imagesRepository) {
		super();
		this.imagesRepository = imagesRepository;	
	}
	
	public Image findById(int ImageId) {
		return imagesRepository.findById(ImageId).get();
	}
	
	
	

}