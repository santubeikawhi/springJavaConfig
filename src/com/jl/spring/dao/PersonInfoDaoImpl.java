package com.jl.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.jl.spring.model.Customer;
import com.jl.spring.model.Person;

public class PersonInfoDaoImpl implements PersonInfoDao{

	//config中 使用Autowired 在bean中 自动装配 bean
	@Autowired
	@Qualifier("person")
	public Person person;
	
	@Autowired
	public Customer customer;
	
	@Override
	public void printPersonName() {
		System.out.println("Dao.person(JavaConfig):"+person.getName());
	}


	@Override
	public void printCustomerName() {
		System.out.println("Dao.customer(JavaConfig):"+customer.getPerson().getName());
	}
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


}
