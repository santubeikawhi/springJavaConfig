package com.jl.spring.model;

public class Person {
	public String name;
	public String sex;
	public String age;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, String sex, String age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
}
