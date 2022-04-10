package com.dev.ecommerce.dto;

import com.dev.ecommerce.model.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel  = "spring")
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);
    CustomerDto toCustomerDto(Customer customer);
    List<CustomerDto> toListCustomerDto(List<Customer> customers);
    Customer toCustomer(CustomerDto customerDto);


}
