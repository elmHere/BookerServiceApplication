package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repo.CustomerRepository;

@Service
public class CustomerService {
	
	private CustomerRepository customerRepository;
	
	public CustomerService(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}
	
	public List<Customer> findAll() {
		return (List<Customer>) customerRepository.findAll();	
	}
	
	public Customer findById(int customerId) {
		return customerRepository.findById(customerId).get();
	}
	
	public List<Customer> saveCustomer(List<Customer> customer) {
		return (List<Customer>) customerRepository.saveAll(customer);
	}
	
	public void deleteCustomer(List<Integer> customerIds) {
		for (Integer custId : customerIds ) {
		customerRepository.deleteById(custId);
		}
	}
	
	public List<Customer> updateCustomer(List<Customer> customer){
	for (Customer updatedCust : customer) {	
	int updatedCustId = updatedCust.getCustomerId();	
	updatedCust.setCustomerId(updatedCustId);
	customerRepository.save(updatedCust);
	}
	return findAll();	
	}

}
