package com.webuni.spring.smartin.logisticapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webuni.spring.smartin.logisticapp.model.Address;
import com.webuni.spring.smartin.logisticapp.repository.AddressRepository;

@Service
public abstract class AbstractAddressSevice implements AddressService {

	@Autowired
	AddressRepository addressRepository;
	
	@Override
	public Address save(Address address) {
		//address.setId(null);
		return addressRepository.save(address);
	}
	
	@Override
	public Address update(Address address) {
		if(!addressRepository.existsById(address.getId()))
			return null;
		return addressRepository.save(address);
	}
	
	@Override
	public List<Address> findAll() {
		return addressRepository.findAll();
	}
	
	@Override
	public Optional<Address> findById(long id){
		
		return addressRepository.findById(id);
	}
	
	@Override
	public void delete(long id) {
		addressRepository.deleteById(id);
	}
}
