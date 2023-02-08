package com.webuni.spring.smartin.logisticapp.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.webuni.spring.smartin.logisticapp.dto.AddressesDto;
import com.webuni.spring.smartin.logisticapp.mapper.AddressMapper;
import com.webuni.spring.smartin.logisticapp.model.Address;
import com.webuni.spring.smartin.logisticapp.service.AddressService;

@RestController
@RequestMapping("/api/addresses")
public class AddressesControler {

	
	@Autowired
	private AddressService addressService;
	
	@Autowired
	private AddressMapper addressMapper;
	
	private Map<Long, AddressesDto> addresses = new HashMap<>(); 
	
	@GetMapping
	public List<AddressesDto> getAll(@RequestParam(required = false) Integer valami){
		if(valami == null)
			return new ArrayList<>(addresses.values());
		else
			return addresses.values()
					.stream()
					.filter(e -> e.getHouseNumber()>valami)
					.collect(Collectors.toList());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<AddressesDto> getById(@PathVariable long id) {
		AddressesDto addressesDto = addresses.get(id);
		if(addressesDto != null)
			return ResponseEntity.ok(addressesDto);
		else
			return ResponseEntity.notFound().build();
	}
	
	
	private Address findByIdOrThrow(long id) {
		return addressService.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
	@PostMapping
	public AddressesDto createAddress(@RequestBody AddressesDto addressDto) {
		addresses.put(addressDto.getId(), addressDto);
		return addressDto;
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<AddressesDto> modifyAddress(@PathVariable long id,@RequestBody AddressesDto addressDto){
		if(!addresses.containsKey(id)) {
			return ResponseEntity.notFound().build();
		}
		
		addressDto.setId(id);
		addresses.put(id, addressDto);
		return ResponseEntity.ok(addressDto);
	}
	
	@DeleteMapping("/{id}")
	public void deleteAddress(@PathVariable long id) {
		addresses.remove(id);
	}
}
