package com.qa.java.inheritance;

public class Runner {

	public static void main(String[] args) {
		
		
		Employee e1 = new Employee("alan", 30,"male",12000);
		//Employee e = new Employee();
		e1.calculateWeeklySalary(12000);
		System.out.println(e1.calculateWeeklySalary(12000));
		System.out.println(e1.calculateMonthlySalary(12000));
	}

}
