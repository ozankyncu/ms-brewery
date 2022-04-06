package com.kyncu.brewery.services;

import com.kyncu.brewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID()).name("Shubham").build();
    }
}
