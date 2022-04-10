package com.kyncu.brewery.services;

import com.kyncu.brewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID()).name("Shubham").build();
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("Ozan").build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        // TODO: would add a real impl to update customer
    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        log.error("delete customer...");
    }
}
