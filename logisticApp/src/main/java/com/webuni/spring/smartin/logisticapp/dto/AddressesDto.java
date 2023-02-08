package com.webuni.spring.smartin.logisticapp.dto;

public class AddressesDto {

	private Long id;
	private String iso;
	private String city;
	private String street;
	private int postCode;
	private int houseNumber;
	private int width;
	private int height;
	
	
	public AddressesDto() {
	}
	
	public AddressesDto(long id, String iso, String city, String street, int postCode, int houseNumber, int width,
			int height) {
		super();
		this.id = id;
		this.iso = iso;
		this.city = city;
		this.street = street;
		this.postCode = postCode;
		this.houseNumber = houseNumber;
		this.width = width;
		this.height = height;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIso() {
		return iso;
	}
	public void setIso(String iso) {
		this.iso = iso;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPostCode() {
		return postCode;
	}
	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
