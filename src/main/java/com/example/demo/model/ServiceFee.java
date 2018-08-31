package com.example.demo.model;

public class ServiceFee {

	private int serviceFeeId;
	private float amount;
	private Service service;
	private String startDate;
	
	
	public int getServiceFeeId() {
		return serviceFeeId;
	}
	public float getAmount() {
		return amount;
	}
	public Service getService() {
		return service;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setServiceFeeId(int serviceFeeId) {
		this.serviceFeeId = serviceFeeId;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	
	
}
