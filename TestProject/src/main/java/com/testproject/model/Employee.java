package com.testproject.model;

public class Employee {

	private int id;
	public Employee(int id, String name, String age, String email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
	}

	private String name;
	
	private String age;
	
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
