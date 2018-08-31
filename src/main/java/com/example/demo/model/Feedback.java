package com.example.demo.model;

public class Feedback {
	
	private int feedbackId;
	private String feedback;
	private int rate;
	private Reservation reservation;
	
	
	public int getFeedbackId() {
		return feedbackId;
	}
	public String getFeedback() {
		return feedback;
	}
	public int getRate() {
		return rate;
	}
	public Reservation getReservation() {
		return reservation;
	}
	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
	
	
	
	

}
