package com.kyncu.brewery.services;

import com.kyncu.brewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getById(UUID customerId);
}
