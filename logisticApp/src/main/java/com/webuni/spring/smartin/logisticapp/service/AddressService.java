package com.webuni.spring.smartin.logisticapp.service;

import java.util.List;
import java.util.Optional;



import com.webuni.spring.smartin.logisticapp.model.Address;


public interface AddressService {

	public Address save(Address address);
	
	public Address update(Address address);
	
	public List<Address> findAll();
	
	public Optional<Address> findById(long id);
	
	public void delete(long id);
	
	
}
