package com.qa.java.abstaction;

public abstract class Vehicle {

	
private int id;
private String type;
private String make;
private String model;
private int wheels;
public Vehicle(int id, String type, String make, String model, int wheels) {
	super();
	this.id = id;
	this.type = type;
	this.make = make;
	this.model = model;
	this.wheels = wheels;
}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}

public int getWheels() {
	return wheels;
}

public String toString() {
	return type + " ID: " + id;
}









}
