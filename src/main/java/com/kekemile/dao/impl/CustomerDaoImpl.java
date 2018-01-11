package com.kekemile.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.kekemile.dao.CustomerDao;
import com.kekemile.model.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	/*
	 * 添加用户的方法
	 */
	public void add(Customer customer) {
		this.getHibernateTemplate().save(customer);
	}

	public void udpate(Customer customer) {
		// TODO Auto-generated method stub

		this.getHibernateTemplate().update(customer);

	}

}
