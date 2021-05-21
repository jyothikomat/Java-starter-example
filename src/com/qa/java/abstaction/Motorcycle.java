package com.qa.java.abstaction;

public class Motorcycle extends Vehicle {
	
	public  boolean hasHelmet;
	
	
	
	

	public Motorcycle(int id, String make, String model, boolean hasHelmet) {
		super(id, "motorcycle", make, model, 2);
		this.hasHelmet = hasHelmet;
	}


	public boolean HasHelmet() {
		return hasHelmet;
	}
	
	
	public void setHasHelmet(boolean hasHelmet) {
		this.hasHelmet = hasHelmet;
	}


	@Override
	public String toString() {
		return super.toString() + " Has Helmet: " + hasHelmet;
	}

	
	
	

	

	
	

}
