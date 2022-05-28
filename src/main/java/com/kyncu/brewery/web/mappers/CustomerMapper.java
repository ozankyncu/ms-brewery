package com.kyncu.brewery.web.mappers;

import com.kyncu.brewery.domain.Customer;
import com.kyncu.brewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto dto);
}
