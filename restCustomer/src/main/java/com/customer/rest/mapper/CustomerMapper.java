package com.customer.rest.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.customer.rest.data.CustomerData;
import com.customer.rest.entity.CustomerEntity;

@Component
public class CustomerMapper {
public CustomerEntity mapToCustomerEntity(final CustomerData data) {
	return mapToCustomerEntity(new CustomerEntity(), data);
}

private CustomerEntity mapToCustomerEntity(CustomerEntity entity, CustomerData data) {
	entity.setFirstName(data.getFirstName());
	entity.setLastName(data.getLastName());
	entity.setSsn(data.getSsn());
	return entity;
}
public CustomerData mapToCustomerData(CustomerEntity entity) {
	
	final CustomerData result = new CustomerData();
	result.setFirstName(entity.getFirstName());
	result.setLastName(entity.getLastName());
	result.setSsn(entity.getSsn());
	result.setId(entity.getPk());
	return result;
	
}

public List<CustomerData> mapToCustomerDataList(final List<CustomerEntity> entityList){
	final List<CustomerData> result = new ArrayList<CustomerData>();
	
	for(CustomerEntity entity : entityList) {
		result.add(mapToCustomerData(entity));
	}
	return result;
}
	
}
