package com.customer.rest.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.rest.data.CustomerData;
import com.customer.rest.service.CustomerService;

@RestController
@RequestMapping("/customer")

public class CustomerWS {

	@Autowired
	CustomerService customerService; 
	
	@PostMapping("/")
	public CustomerData addCustomer(@RequestBody CustomerData customer) {
		return customerService.createCustomer(customer);
	}
	
	@GetMapping(value = "/{id}")
	public CustomerData getPerson(@PathVariable("id") long id) {
		 return customerService.findCustomer(id);
	}
	

	
	
	@PutMapping("/")
	public void updatePerson(@RequestBody CustomerData customerData) {
		 customerService.modifyCustomer(customerData);
	}
	
	@DeleteMapping(value = "/{id}")
	public void removeCustomer(@PathVariable("id") long id) {
		customerService.removeCustomer(id);
	}

}