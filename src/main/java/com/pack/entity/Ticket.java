package com.pack.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ticket
{
	
	@Id
	private Integer ticketid;
	private String passengername;
	private String source;
	private String destination;
	private Date dateofbooking;
	private Double ticketfare;
	private String email;
	private String rating;
	private String gender;
	private String feedback;
	public Integer getTicketid() {
		return ticketid;
	}
	public void setTicketid(Integer ticketid) {
		this.ticketid = ticketid;
	}
	public String getPassengername() {
		return passengername;
	}
	public void setPassengername(String passengername) {
		this.passengername = passengername;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getDateofbooking() {
		return dateofbooking;
	}
	public void setDateofbooking(Date dateofbooking) {
		this.dateofbooking = dateofbooking;
	}
	public Double getTicketfare() {
		return ticketfare;
	}
	public void setTicketfare(Double ticketfare) {
		this.ticketfare = ticketfare;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	
}
