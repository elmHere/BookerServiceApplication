package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TravelPackage {
	
	@Id
	@GeneratedValue
	private int travelPackageId;
	private int packageName;
	@OneToMany(mappedBy = "travelPackage")
	private List<Service> availableServiceList;
	@OneToMany(mappedBy = "travelPackage") 
	private List<Image> images;
	private String description;
	
	
	
	public int getTravelPackageId() {
		return travelPackageId;
	}
	public void setTravelPackageId(int travelPackageId) {
		this.travelPackageId = travelPackageId;
	}
	public int getPackageName() {
		return packageName;
	}
	public void setPackageName(int packageName) {
		this.packageName = packageName;
	}
	public List<Service> getAvailableServiceList() {
		return availableServiceList;
	}
	public void setAvailableServiceList(List<Service> availableServiceList) {
		this.availableServiceList = availableServiceList;
	}
	public List<Image> getImages() {
		return images;
	}
	public void setImages(List<Image> images) {
		this.images = images;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
	
	
	

}
