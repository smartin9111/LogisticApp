package com.webuni.spring.smartin.logisticapp.model;

public class TransportPlan {
	
	
	private Long id;
	private Integer expectedIncome;
	
	
	private Section sections;
	
	
	
	public TransportPlan() {
	}
	
	public TransportPlan(Long id, Integer expectedIncome, Section sections) {
		this.id = id;
		this.expectedIncome = expectedIncome;
		this.sections = sections;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Integer getExpectedIncome() {
		return expectedIncome;
	}
	
	public void setExpectedIncome(Integer expectedIncome) {
		this.expectedIncome = expectedIncome;
	}
	
	public Section getSections() {
		return sections;
	}
	
	public void setSections(Section sections) {
		this.sections = sections;
	}
	
	
}
