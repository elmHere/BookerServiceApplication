package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	private CustomerService customerService;
	
	public CustomerController (CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
// get all customers
	@GetMapping
	public List<Customer> getAllCustomers(){
		return customerService.findAll();
	}
	
// save a customer
	@PostMapping
	public List<Customer> saveCustomer(@RequestBody List<Customer> customer){
		return customerService.saveCustomer(customer);		
	}
	
// delete a set of customers given their customerIds
	@DeleteMapping
	public List<Integer> deleteCustomer(@RequestParam (value = "ids", required = false) List<Integer> ids) {
		customerService.deleteCustomer(ids);
		return ids;
	}
	
////update list
	@PutMapping
	public List<Customer> updateCustomer(@RequestBody List<Customer> customer){
	return customerService.updateCustomer(customer);
}	
	
	
	
	
	
	
	
	
	
}
