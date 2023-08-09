package com.mariosan.hexagonal.application.ports.out;

import com.mariosan.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);

}
