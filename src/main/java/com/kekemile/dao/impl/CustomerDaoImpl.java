package com.kekemile.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.kekemile.dao.CustomerDao;
import com.kekemile.model.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	/*
	 * ����û��ķ���
	 */
	public void add(Customer customer) {
		this.getHibernateTemplate().save(customer);
	}

}
