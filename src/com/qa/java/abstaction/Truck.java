package com.qa.java.abstaction;

public class Truck extends Vehicle {

	

	public Truck(int id,  String make, String model) {
		super(id, "truck", make, model, 8, 30000);
		// TODO Auto-generated constructor stub
	}
	public double repairbill() {
		return super.getPrice()/6;
	}
	

}
