package com.dps.aiotracker.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.dps.aiotracker.domain.Customer;
import com.dps.aiotracker.dto.CustomerDTO;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
	CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

	CustomerDTO toDto(Customer customer);

	Customer toEntity(CustomerDTO customerDTO);

	List<CustomerDTO> toDto(List<Customer> customers);

	List<Customer> toEntity(List<CustomerDTO> customerDTOs);
}
