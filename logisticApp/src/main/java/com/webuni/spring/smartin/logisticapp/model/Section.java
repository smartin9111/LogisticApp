package com.webuni.spring.smartin.logisticapp.model;

public class Section {
	
	
	private Long id;
	private Integer Number;
	private MileStone fromMilestone;
	private MileStone toMilestone;
	
	
	private TransportPlan transportPlan;
	

	public Section() {
	
	}


	public Section(Long id, Integer number, MileStone fromMilestone, MileStone toMilestone) {
		super();
		this.id = id;
		Number = number;
		this.fromMilestone = fromMilestone;
		this.toMilestone = toMilestone;
	}


	public TransportPlan getTransportPlan() {
		return transportPlan;
	}


	public void setTransportPlan(TransportPlan transportPlan) {
		this.transportPlan = transportPlan;
	}

	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Integer getNumber() {
		return Number;
	}


	public void setNumber(Integer number) {
		Number = number;
	}


	public MileStone getFromMilestone() {
		return fromMilestone;
	}


	public void setFromMilestone(MileStone fromMilestone) {
		this.fromMilestone = fromMilestone;
	}


	public MileStone getToMilestone() {
		return toMilestone;
	}


	public void setToMilestone(MileStone toMilestone) {
		this.toMilestone = toMilestone;
	}
	
	
	
}
