/*package com.customer.rest.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.customer.rest.data.CustomerData;
import com.customer.rest.entity.CustomerEntity;
import com.customer.rest.entity.QueryConstant1;
import com.customer.rest.exception.InvalidDataException;
import com.customer.rest.mapper.CustomerMapper;

@Service("csJpa")
@Transactional
public class CustomerServiceImpl1 implements CustomerService{

	@PersistenceContext
	private EntityManager em;
	@Autowired
	private CustomerMapper mapper;
	
	@Override
	public CustomerData createCustomer(final CustomerData customer) {
		 if (customer == null || StringUtils.isEmpty(customer.getFirstName()) || StringUtils.isEmpty(customer.getLastName())){

			throw new InvalidDataException("Customer creation failed");
		}
		 final CustomerEntity entity = mapper.mapToCustomerEntity(customer);
		 em.persist(entity);
		 customer.setId(entity.getPk());
		 return customer;
	}

	@Override
	public void modifyCustomer(CustomerData customerData) {
		if (customerDataMap.containsKey(customerData.getId())) {
			customerDataMap.put(customerData.getId(), customerData);
		} else {
			throw new RuntimeException("No customer was found in database");
		}
		
	}

	@Override
	public CustomerData findCustomer(Long id) {
		if (id == null) {
			throw new InvalidException("Id required to find customer");
		}
		final CustomerEntity entity = findCustomerEntity(id);
		return mapper.mapToCustomerData(entity);
	}

	@Override
	public List<CustomerData> searchCustomer(String firstName, String lastName) {
		final String fName = (firstName == null) ? "%" : firstName.trim() + "%";
		
		final String lName = (lastName == null) ? "%" : lastName.trim() + "%";
		
		final TypedQuery<CustomerEntity> query = em.createNamedQuery(QueryConstant1.CUSTOMER_SEARCH,CustomerEntity.class);
		query.setParameter("fName", lName);
		query.setParameter("lName", lName);
		
		final List<CustomerEntity> resultList = query.getResultList();
		return mapper.mapToCustomerDataList(resultList);
	}

	@Override
	public void removeCustomer(Long id) {
		if(id == null) {
			throw new InvalidException("Id required to remove");
		}
		final CustomerEntity entity = findCustomerEntity(id);
		em.remove(entity);
		
	}

	@Override
	public List<CustomerData> searchCustomer(CustomerData customerData) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
*/