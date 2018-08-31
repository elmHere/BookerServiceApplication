package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Image {
	
	@Id
	@GeneratedValue
	private int imageId;
	private String description;
	private String imageUrl;
	@ManyToOne
	private Service service;
	@ManyToOne
	private TravelPackage travelPackage;

	int getImageId() {
		return imageId;
	}
	public String getDescription() {
		return description;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageId(int imageId) {
		this.imageId = imageId;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	
	
	
}
