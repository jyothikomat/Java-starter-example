package com.qa.java.inheritance;

public class Runner {

	public static void main(String[] args) {
		
		
		Employee e1 = new Employee("alan", 30,"male",12000);
		//Employee e = new Employee();
		Person p = new Person("aaa",22,"femail");
		e1.calculateWeeklySalary(e1.calculateWeeklySalary(12000));
		e1.calculateWeeklySalary(e1.calculateMonthlySalary(12000));
		System.out.println("Alen weeklysalary : "+e1.calculateWeeklySalary(12000));
		System.out.println("Alen Monthlysalary: "+e1.calculateMonthlySalary(12000));
		System.out.println(e1.getName() + "  Annualsalary: " + e1.getAnnualsalary());
		System.out.println(e1);
	}

}
