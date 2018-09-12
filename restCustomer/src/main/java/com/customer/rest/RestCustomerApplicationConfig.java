/*package com.customer.rest;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;

import com.customer.rest.data.CustomerData;
import com.customer.rest.entity.CustomerEntity;
import com.customer.rest.exception.CustomerNotFoundException;
import com.customer.rest.exception.InvalidDataException;
import com.customer.rest.exceptionHandler.CustomerNotFoundExceptionHandler;
import com.customer.rest.exceptionHandler.InvalidDataExceptionHandler;
import com.customer.rest.mapper.CustomerMapper;
import com.customer.rest.resource.CustomerWS;
import com.customer.rest.service.CustomerService;
import com.customer.rest.service.CustomerServiceImpl;

@Configuration
public class RestCustomerApplicationConfig extends ResourceConfig{
	public RestCustomerApplicationConfig() {
		register(CustomerWS.class);
		register(CustomerMapper.class);
		register(CustomerService.class);
		register(CustomerServiceImpl.class);
		register(CustomerEntity.class);
		register(CustomerData.class);
		register(CustomerNotFoundException.class);
		register(InvalidDataException.class);
		register(CustomerNotFoundExceptionHandler.class);
		register(InvalidDataExceptionHandler.class);
	}
}
*/