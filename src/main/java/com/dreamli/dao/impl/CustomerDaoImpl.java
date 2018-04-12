package com.dreamli.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.dreamli.dao.CustomerDao;
import com.dreamli.domain.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	@Override
	public Customer findCustomerById(String custId) {
		return getHibernateTemplate().get(Customer.class, custId);
	}

	@Override
	public void deleteCustomer(Customer customer) {
		getHibernateTemplate().delete(customer);
	}
}
