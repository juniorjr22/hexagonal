package com.mariosan.hexagonal.application.ports.in;

import com.mariosan.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);

}
