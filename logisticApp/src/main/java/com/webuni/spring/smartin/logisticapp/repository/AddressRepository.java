package com.webuni.spring.smartin.logisticapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webuni.spring.smartin.logisticapp.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
	

	
}
