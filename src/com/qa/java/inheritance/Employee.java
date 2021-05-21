package com.qa.java.inheritance;

public class Employee extends Person{
	

private double annualsalary;
private double weeklylsalary;


public Employee(String name, int age, String gender, double annualsalary) {
	super(name, age, gender);
	this.annualsalary = annualsalary;
	//this.weeklylsalary = weeklylsalary;
}
public double calculateWeeklySalary(double annualsalary ) {
	return  annualsalary / 52;
}
	public double calculateMonthlySalary(double annualsalary ) {
		return  annualsalary / 12;

			 
}
public double getAnnualsalary() {
	return annualsalary;
}
public void setAnnualsalary(double annualsalary) {
	this.annualsalary = annualsalary;
}
public double getWeeklylsalary() {
	return weeklylsalary;
}
public void setWeeklylsalary(double weeklylsalary) {
	this.weeklylsalary = weeklylsalary;
}

}
