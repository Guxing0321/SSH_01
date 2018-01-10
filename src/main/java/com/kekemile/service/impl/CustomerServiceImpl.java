package com.kekemile.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.kekemile.dao.CustomerDao;
import com.kekemile.model.Customer;
import com.kekemile.service.CustomerService;

@Transactional
public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao;

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public void add(Customer customer) {
		System.out.println("Ö´ÐÐ CustomerServiceImple.add()Ö´ÐÐ");
		customerDao.add(customer);

	}

}
