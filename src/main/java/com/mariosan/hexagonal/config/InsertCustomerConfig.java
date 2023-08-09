package com.mariosan.hexagonal.config;

import com.mariosan.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.mariosan.hexagonal.adapters.out.InsertCustomerAdapter;
import com.mariosan.hexagonal.adapters.out.SendCpfForValidationAdapter;
import com.mariosan.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfForValidationAdapter sendCpfForValidationAdapter) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfForValidationAdapter);
    }

}
