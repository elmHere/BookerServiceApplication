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
	public String getServiceName() {
		return serviceName;
	}
	public String getDescription() {
		return description;
	}
	public List<Image> getImages() {
		return images;
	}
	
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setImages(List<Image> images) {
		this.images = images;
	}
	
	
	
	
	
}
