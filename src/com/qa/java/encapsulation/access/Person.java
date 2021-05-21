package com.qa.java.encapsulation.access;

public class Person {
	
	private String name; //
	private int age; //
	private String gender; //
	public boolean isBreathing;
	public int walkSpeed = 30; // in feet
	// Constructor
	public Person(String name, int age, String gender) {
	this.name = name;
	this.age = age;
	this.gender = gender;
	}
	public void read(Book item) {
		//bk.open();
		//if(bk.open())
	System.out.println(this.name + " is reading the book titled:" + item.title);
	}
	public boolean isStillBreathing() {
	return isBreathing;
	}
	public String speak(String msg) {
	return this.name + " says: " + msg;
	}
	public int walk() {
	return walkSpeed;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
