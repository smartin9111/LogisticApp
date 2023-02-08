package com.webuni.spring.smartin.logisticapp.mapper;

import com.webuni.spring.smartin.logisticapp.dto.AddressesDto;
import com.webuni.spring.smartin.logisticapp.model.Address;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-08T21:05:31+0200",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.50.v20210914-1429, environment: Java 17.0.2 (Eclipse Adoptium)"
)
@Component
public class AddressMapperImpl implements AddressMapper {

    @Override
    public List<AddressesDto> addressesToDto(List<Address> addresses) {
        if ( addresses == null ) {
            return null;
        }

        List<AddressesDto> list = new ArrayList<AddressesDto>( addresses.size() );
        for ( Address address : addresses ) {
            list.add( addressToDto( address ) );
        }

        return list;
    }

    @Override
    public AddressesDto addressToDto(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressesDto addressesDto = new AddressesDto();

        addressesDto.setId( address.getId() );
        addressesDto.setIso( address.getIso() );
        addressesDto.setCity( address.getCity() );
        addressesDto.setStreet( address.getStreet() );
        addressesDto.setPostCode( address.getPostCode() );
        addressesDto.setHouseNumber( address.getHouseNumber() );
        addressesDto.setWidth( address.getWidth() );
        addressesDto.setHeight( address.getHeight() );

        return addressesDto;
    }

    @Override
    public Address dtoToAddress(AddressesDto addressDto) {
        if ( addressDto == null ) {
            return null;
        }

        Address address = new Address();

        address.setId( addressDto.getId() );
        address.setIso( addressDto.getIso() );
        address.setCity( addressDto.getCity() );
        address.setStreet( addressDto.getStreet() );
        address.setPostCode( addressDto.getPostCode() );
        address.setHouseNumber( addressDto.getHouseNumber() );
        address.setWidth( addressDto.getWidth() );
        address.setHeight( addressDto.getHeight() );

        return address;
    }

    @Override
    public List<Address> dtosToAdresses(List<AddressesDto> addresses) {
        if ( addresses == null ) {
            return null;
        }

        List<Address> list = new ArrayList<Address>( addresses.size() );
        for ( AddressesDto addressesDto : addresses ) {
            list.add( dtoToAddress( addressesDto ) );
        }

        return list;
    }
}
