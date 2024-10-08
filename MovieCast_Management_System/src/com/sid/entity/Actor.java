package com.sid.entity;

import java.util.Collection;

//POJO Class
public class Actor {
	// all variables are private
	private String name;
	private String gender;
	private int age;

	// default constructor
	public Actor() {
		super();
	}

	// parameterized constructor
	public Actor(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;

	}

	// geters and setters
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

	// toString method
	@Override
	public String toString() {
		return "Actor [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

}
