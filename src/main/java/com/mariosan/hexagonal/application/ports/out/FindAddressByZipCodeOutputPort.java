package com.mariosan.hexagonal.application.ports.out;

import com.mariosan.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);

}
