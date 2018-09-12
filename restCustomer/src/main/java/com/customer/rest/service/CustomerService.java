package com.customer.rest.service;

import java.util.List;

import com.customer.rest.data.CustomerData;

public interface CustomerService {
	
	CustomerData createCustomer(final  CustomerData customerData);
	
	void modifyCustomer(final CustomerData customerData);
	
	CustomerData findCustomer(final Long id);
	
	List<CustomerData> searchCustomer(final String firstName, String lastName);
	
	List<CustomerData> searchCustomer(final CustomerData customerData);
	
	void removeCustomer(final Long id);

	

	
}
