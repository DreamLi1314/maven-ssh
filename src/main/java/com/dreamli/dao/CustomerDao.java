package com.dreamli.dao;

import com.dreamli.domain.Customer;

public interface CustomerDao {

	/**
	 * @Description: 根据 customer id 查找 customer   
	 * @Warning: 
	 * @Author: dreamli
	 * @Date: 2018年4月12日 下午11:23:51
	 * @Version: 1.0.0
	 * @param custId customer 的 id
	 * @return custId 对应 customer， 没有记录返回null
	 */
	public Customer findCustomerById(String custId);
	
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
