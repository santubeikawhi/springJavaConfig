package com.jl.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jl.spring.config.AppConfig;
import com.jl.spring.dao.PersonInfoDao;
import com.jl.spring.model.Customer;
import com.jl.spring.model.Person;

/**   
* @Title: Webapp.java JavaConfig配置 生成 bean配置
* @Package com.jl.spring.app 
* @Description: TODO
* @author jiangl  
* @date 2018年3月8日 下午9:53:10 
* @version V1.0   
*/
public class Webapp {
	public static void main(String args[]){
		//初始化AnnotationConfigApplicationContext（Object.class）生成ApplicationContext对象
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		//单个bean对象person
		Person person = (Person)applicationContext.getBean("person");
		//dao层bean对象
		PersonInfoDao personInfoDao = (PersonInfoDao)applicationContext.getBean("personInfoDao");
		Customer customer = (Customer)applicationContext.getBean("customer");
		System.out.println("person(JavaConfig):"+person.getName());
		System.out.println("customer(JavaConfig):"+customer.getPerson().getName());
		personInfoDao.printPersonName();
		personInfoDao.printCustomerName();
	}
}
