package com.webuni.spring.smartin.logisticapp.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.webuni.spring.smartin.logisticapp.dto.AddressesDto;
import com.webuni.spring.smartin.logisticapp.model.Address;

@Mapper(componentModel="spring")
public interface AddressMapper {

	List<AddressesDto> addressesToDto(List<Address> addresses);
	
	AddressesDto addressToDto(Address address);

	Address dtoToAddress(AddressesDto addressDto);
	
	List<Address> dtosToAdresses(List<AddressesDto> addresses);
}
