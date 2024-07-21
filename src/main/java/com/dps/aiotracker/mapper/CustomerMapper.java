package com.dps.aiotracker.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.dps.aiotracker.domain.Customer;
import com.dps.aiotracker.dto.CustomerDTO;

@Mapper
public interface CustomerMapper {
	CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

	CustomerDTO toDto(Customer customer);

	Customer toEntity(CustomerDTO customerDTO);
}
