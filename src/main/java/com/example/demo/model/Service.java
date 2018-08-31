package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Service {
	@Id
	@GeneratedValue
	private int serviceId;
	private String serviceName;
	private String description;
	@OneToMany(mappedBy = "service")
	private List<Image> images;
	@ManyToOne
	private TravelPackage travelPackage;
	
	
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Image> getImages() {
		return images;
	}
	public void setImages(List<Image> images) {
		this.images = images;
	}
	public TravelPackage getTravelPackage() {
		return travelPackage;
	}
	public void setTravelPackage(TravelPackage travelPackage) {
		this.travelPackage = travelPackage;
	}
	
	
	
	
	
	
	
}
