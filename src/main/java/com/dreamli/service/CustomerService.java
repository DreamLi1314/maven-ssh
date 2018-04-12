package com.dreamli.service;

import com.dreamli.domain.Customer;

public interface CustomerService {

	/**
	 * @Description: 根据 customer id 查找 customer
	 * @Warning: 
	 * @Author: dreamli
	 * @Date: 2018年4月12日 下午11:20:23
	 * @Version: 1.0.0
	 * @param id
	 * @return custId 对应 customer， 没有记录返回null
	 */
	public Customer findCustomer(String custId);
	
	/**
	 * @Description: 删除指定的 Customer   
	 * @Warning: 
	 * @Author: dreamli
	 * @Date: 2018年4月13日 上午12:39:17
	 * @Version: 1.0.0
	 * @param customer 要删除的Customer
	 */
	public void deleteCustomer(Customer customer);
}
