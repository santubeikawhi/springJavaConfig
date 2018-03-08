package com.jl.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {
	//config中 使用Autowired 在bean中 自动装配 bean
	@Autowired
	@Qualifier("person2")
	public Person person;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Person person) {
		super();
		this.person = person;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
