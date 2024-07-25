package com.dps.aiotracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dps.aiotracker.domain.Customer;
import com.dps.aiotracker.dto.CustomerDTO;
import com.dps.aiotracker.mapper.CustomerMapper;
import com.dps.aiotracker.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private CustomerMapper customerMapper;

	public List<CustomerDTO> getAllCustomers() {
		List<Customer> resultado = customerRepository.findAll();
		return customerMapper.toDto(resultado);
	}

	public CustomerDTO getCustomerById(Long id) {
		Customer customer = customerRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Customer not found"));
		return customerMapper.toDto(customer);
	}

	public CustomerDTO createCustomer(CustomerDTO customerDTO) {
		Customer customer = customerMapper.toEntity(customerDTO);
		Customer savedCustomer = customerRepository.save(customer);
		return customerMapper.toDto(savedCustomer);
	}

	public CustomerDTO updateCustomer(Long id, CustomerDTO customerDTO) {
		Customer customer = customerRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Customer not found"));
		customer.setName(customerDTO.getName());
		customer.setEmail(customerDTO.getEmail());
		Customer updatedCustomer = customerRepository.save(customer);
		return customerMapper.toDto(updatedCustomer);
	}

	public void deleteCustomer(Long id) {
		customerRepository.deleteById(id);
	}
}
