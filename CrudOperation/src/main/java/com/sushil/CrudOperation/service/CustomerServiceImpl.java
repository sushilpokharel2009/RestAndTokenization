package com.sushil.CrudOperation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.sushil.CrudOperation.model.Customer;


public class CustomerServiceImpl implements CustomerService{
	private static List<Customer> customers = new ArrayList<>();
	
	@Override
	public List<Customer> getAllCustomer() {
		return customers;
	}

	@Override
	public Customer getCustomerById(int id) {
		for(Customer customer : customers) {
			if(customer.getId() == id) {
				return customer;
			}
		}
		return null;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		Random random = new Random();
		int nextId = random.nextInt(100) + 10;
		
		customer.setId(nextId);
		customers.add(customer);
		return customer;
		
		
	}
	

	@Override
	public void updateCustomer(Customer customer) {
		
		for(Customer oldCustomer : customers) {
			if(oldCustomer.getId() == customer.getId()) {
				oldCustomer.setName(customer.getName());
				oldCustomer.setEmail(customer.getEmail());
				oldCustomer.setDescription(customer.getDescription());
			}
		}
	}

	@Override
	public void deleteCustomer(int id) {
		for(Customer c : customers) {
			if(c.getId() == id) {
				customers.remove(c);
				break;
			}
		}
		
	}

}
