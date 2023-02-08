package com.webuni.spring.smartin.logisticapp.model;

import java.time.LocalDateTime;


public class MileStone {

	
	private Long id;
	private LocalDateTime plannedTime;
	

	private Address address;
	
	
	public MileStone() {
	}

	public MileStone(Long id, LocalDateTime plannedTime, Address adress) {
		this.id = id;
		this.plannedTime = plannedTime;
		this.address = adress;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public LocalDateTime getPlannedTime() {
		return plannedTime;
	}
	
	public void setPlannedTime(LocalDateTime plannedTime) {
		this.plannedTime = plannedTime;
	}
	
	public Address getAdress() {
		return address;
	}
	
	public void setAdress(Address adress) {
		this.address = adress;
	}	
	
}
