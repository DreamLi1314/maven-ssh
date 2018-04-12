package com.dreamli.domain;

import java.io.Serializable;

public class Customer implements Serializable {
	private String custId;
	private String name;
	private int age;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String id, String name, int age) {
		super();
		this.custId = id;
		this.name = name;
		this.age = age;
	}

	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [id=" + custId + ", name=" + name + ", age=" + age + "]";
	}

}
