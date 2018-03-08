package com.jl.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jl.spring.dao.PersonInfoDao;
import com.jl.spring.dao.PersonInfoDaoImpl;
import com.jl.spring.model.Customer;
import com.jl.spring.model.Person;

@Configuration
public class AppConfig {
	
	@Bean(name="person")
	public Person Person(){
		return new Person("Ray","man","26");
	}
	@Bean(name="person2")
	public Person Person2(){
		return new Person("Nicole","woman","26");
	}
	
	@Bean(name="customer")
	public Customer Customer(){
		return new Customer();
	}
	
	//Dao≤„bean ∂‘œÛ
	@Bean(name="personInfoDao")
	public PersonInfoDao PersonInfoDao(){
		return new PersonInfoDaoImpl();
	}
}
