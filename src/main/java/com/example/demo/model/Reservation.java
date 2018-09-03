package com.example.demo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


public class Reservation {

	private int reservationId;
	private List<Service> availedServiceList;
	private Date departureDate;
	private Customer custsomer;
	
	
	public int getReservationId() {
		return reservationId;
	}
	public List<Service> getAvailedServiceList() {
		return availedServiceList;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public Customer getCustsomer() {
		return custsomer;
	}
	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}
	public void setAvailedServiceList(List<Service> availedServiceList) {
		this.availedServiceList = availedServiceList;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public void setCustsomer(Customer custsomer) {
		this.custsomer = custsomer;
	}
	
	
	

}
