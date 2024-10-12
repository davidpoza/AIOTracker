package com.dps.aiotracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dps.aiotracker.domain.Customer;
import com.dps.aiotracker.dto.CustomerDTO;
import com.dps.aiotracker.mapper.CustomerMapper;
import com.dps.aiotracker.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public List<CustomerDTO> getAllCustomers() {
		List<Customer> resultado = customerRepository.findAll();
		return customerMapper.toDto(resultado);
	}

	@Override
	public CustomerDTO getCustomerById(Long id) {
		Customer customer = customerRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Customer not found"));
		return customerMapper.toDto(customer);
	}

	@Override
	public CustomerDTO createCustomer(CustomerDTO customerDTO) {
		Customer customer = customerMapper.toEntity(customerDTO);
		Customer savedCustomer = customerRepository.save(customer);
		return customerMapper.toDto(savedCustomer);
	}

	@Override
	public CustomerDTO updateCustomer(Long id, CustomerDTO customerDTO) {
		Customer customer = customerRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Customer not found"));
		customer.setName(customerDTO.getName());
		customer.setEmail(customerDTO.getEmail());
		Customer updatedCustomer = customerRepository.save(customer);
		return customerMapper.toDto(updatedCustomer);
	}

	@Override
	public void deleteCustomer(Long id) {
		customerRepository.deleteById(id);
	}

	private Boolean validatePOST(CustomerDTO customerDTO) {
		if (customerDTO.getId() != null) {

		}
	}
}
