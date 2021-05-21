package com.qa.java.abstaction;

public class Car extends Vehicle {

		
	

	public Car(int id, String make, String model) {
		super(id, "car", make, model, 4,20000);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public double repairbill() {
		return super.getPrice()/10;
	}



	



	

	
	
}
