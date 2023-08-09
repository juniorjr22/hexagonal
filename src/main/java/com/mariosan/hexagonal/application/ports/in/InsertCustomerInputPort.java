package com.mariosan.hexagonal.application.ports.in;

import com.mariosan.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);

}
