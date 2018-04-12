package com.dreamli.web.actions;

import com.dreamli.domain.Customer;
import com.dreamli.service.CustomerService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport {
	
	private CustomerService customerService;
	private String custId;
	
	// 用于 Spring 依赖注入
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	// 用于将请求参数注入
	public void setCustId(String custId) {
		this.custId = custId;
	}
	
	public String findCustomer() throws Exception {
		System.out.println("正在查询客户信息， 请稍候....");
		
		Customer customer = customerService.findCustomer(custId);
		System.out.println(customer);
		
		ActionContext.getContext().getValueStack().push(customer);
		
		return SUCCESS;
	}
	
	public String deleteCustomer() throws Exception {
		System.out.println("正在删除客户信息， 请稍候....");
		
		Customer customer = customerService.findCustomer(custId);
		System.out.println(customer);

		customerService.deleteCustomer(new Customer(custId, null, 0));
		
		ActionContext.getContext().getValueStack().push(customer + "=del=" + SUCCESS);
		
		return SUCCESS;
	}
}
