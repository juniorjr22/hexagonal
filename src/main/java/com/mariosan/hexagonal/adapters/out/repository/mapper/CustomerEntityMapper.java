package com.mariosan.hexagonal.adapters.out.repository.mapper;

import com.mariosan.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.mariosan.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);

}
