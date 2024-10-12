package com.dps.aiotracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dps.aiotracker.dto.CustomerDTO;

@Service
public interface CustomerService {

	public List<CustomerDTO> getAllCustomers();

	public CustomerDTO getCustomerById(Long id);

	public CustomerDTO createCustomer(CustomerDTO customerDTO);

	public CustomerDTO updateCustomer(Long id, CustomerDTO customerDTO);

	public void deleteCustomer(Long id);

	private Boolean validatePOST(CustomerDTO customerDTO);
}
