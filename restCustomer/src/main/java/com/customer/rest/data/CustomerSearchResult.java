package com.customer.rest.data;

import java.util.List;

public class CustomerSearchResult {
	private List<CustomerData> customers;

	public CustomerSearchResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerSearchResult(List<CustomerData> customers) {
		super();
		this.customers = customers;
	}

	public List<CustomerData> getCustomers() {
		return customers;
	}

	public void setCustomers(List<CustomerData> customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "CustomerSearchResult [customers=" + customers + "]";
	}
	
}
