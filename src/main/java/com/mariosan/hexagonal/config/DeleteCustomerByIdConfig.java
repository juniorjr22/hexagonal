package com.mariosan.hexagonal.config;

import com.mariosan.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.mariosan.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.mariosan.hexagonal.adapters.out.InsertCustomerAdapter;
import com.mariosan.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.mariosan.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.mariosan.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter findAddressByZipCodeAdapter) {
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter);
    }

}
