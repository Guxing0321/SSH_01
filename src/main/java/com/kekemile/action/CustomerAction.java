package com.kekemile.action;

import com.kekemile.model.Customer;
import com.kekemile.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {

	private static final long serialVersionUID = 1L;

	private CustomerService customerService;

	private Customer customer = new Customer();

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Customer getModel() {
		return customer;
	}

	public void Test() {

		// System.out.println("customer.cust_name = " +
		// customer.getCust_name());

		// System.out.println("ִ�� CustomerAction �е� Test() ����");

		customerService.add(customer);

	}

	public String update() {

		return NONE;
	}

}
