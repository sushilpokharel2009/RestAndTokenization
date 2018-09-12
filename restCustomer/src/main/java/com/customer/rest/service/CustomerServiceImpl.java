package com.customer.rest.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.customer.rest.data.CustomerData;
import com.customer.rest.exception.InvalidDataException;

@Service
public class CustomerServiceImpl implements CustomerService {

	private Map<Long, CustomerData> customerDataMap = new HashMap<Long, CustomerData>();

	@Override
	public CustomerData createCustomer(final CustomerData customerData) {
		if (customerData != null) {
			customerData.setId(System.currentTimeMillis());
			customerDataMap.put(customerData.getId(), customerData);
		}else if (customerData == null || StringUtils.isEmpty(customerData.getFirstName())
				|| StringUtils.isEmpty(customerData.getLastName())){

			throw new InvalidDataException("Customer creation failed");
		}
		return customerData;
	}

	@Override
	public void modifyCustomer(final CustomerData customerData) {
		if (customerDataMap.containsKey(customerData.getId())) {
			customerDataMap.put(customerData.getId(), customerData);
		} else {
			throw new RuntimeException("No customer was found in database");
		}
	}

	@Override
	public CustomerData findCustomer(final Long id) {
		return customerDataMap.get(id);

	}

	@Override
	public List<CustomerData> searchCustomer(final CustomerData customerData) {
		
		/*List<CustomerData> result = new ArrayList<CustomerData>();
		final Collection<CustomerData> allCustomers = customerDataMap.values();
		for (CustomerData cData : allCustomers) {
			
			if (cData.getFirstName().toLowerCase().startsWith(firstName.toLowerCase())
					|| cData.getLastName().toLowerCase().startsWith(lastName.toLowerCase())) {
				result.add(cData);
			}
			return result;
		}*/
		return null;
	}

	@Override
	public void removeCustomer(Long id) {
		if (customerDataMap.containsKey(id)) {
			customerDataMap.remove(id);
		} else if (id == null) {
			throw new InvalidDataException("Id is required to remove");

		} else {
			throw new RuntimeException("No customer found in Database");
		}

	}

	@Override
	public List<CustomerData> searchCustomer(String firstName, String lastName) {
		List<CustomerData> result = new ArrayList<CustomerData>();
		final Collection<CustomerData> allCustomers = customerDataMap.values();
		for (CustomerData cData : allCustomers) {
			
			if (cData.getFirstName().toLowerCase().startsWith(firstName.toLowerCase())
					|| cData.getLastName().toLowerCase().startsWith(lastName.toLowerCase())) {
				result.add(cData);
			}
		}
		return result;
	}

}
