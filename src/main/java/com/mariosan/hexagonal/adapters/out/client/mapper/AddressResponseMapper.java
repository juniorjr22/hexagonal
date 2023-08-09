package com.mariosan.hexagonal.adapters.out.client.mapper;

import com.mariosan.hexagonal.adapters.out.client.response.AddressResponse;
import com.mariosan.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
