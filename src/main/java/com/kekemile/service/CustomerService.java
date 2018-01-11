package com.kekemile.service;

import com.kekemile.model.Customer;

public interface CustomerService {

	/**
	 * 添加用户的方法的类
	 * 
	 * @param customer
	 */
	public void add(Customer customer);
	public void update(Customer customer);

}
