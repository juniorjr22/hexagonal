package com.mariosan.hexagonal.application.ports.in;

import com.mariosan.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);

}
