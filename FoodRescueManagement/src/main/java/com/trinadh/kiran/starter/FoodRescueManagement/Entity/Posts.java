package com.trinadh.kiran.starter.FoodRescueManagement.Entity;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Posts {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	@Column(name="mobile")
	String mobile;
	
	@Column(name="message")
	String message;

	@Column(name="date")
	LocalDate date=LocalDate.now();
	
	@Column(name="datetime")
	LocalDateTime datetime=LocalDateTime.now();
	
	@Column(name="time")
	LocalTime time=LocalTime.now();
	
	public Posts() {
		
	}

	public Posts(String mobile, String message, LocalDate date, LocalDateTime datetime, LocalTime time) {
		super();
		this.mobile = mobile;
		this.message = message;
		this.date = date;
		this.datetime = datetime;
		this.time = time;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalDateTime getDatetime() {
		return datetime;
	}

	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	
}
