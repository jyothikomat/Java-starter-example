package com.qa.java.abstaction;

public class Runner {
	public static void main(String[] args) {

		Vehicle car1 = new Car(567, "honda", "pilot");
		Vehicle car2 = new Car(267, "honda", "camry");
		Vehicle mc1 = new Motorcycle(983, "honda", "honda", true);
		Vehicle t1 = new Truck(300, "honda", "honda");
		Garage g = new Garage();
		g.addVehicle(car1);
		g.addVehicle(car2);
		g.addVehicle(mc1);
		g.addVehicle(t1);
		System.out.println(g.showTotalRepairBills());
		//g.removeVehicle(567);
//		System.out.println(g.toString());
        //g.showGarage();
	//	g.clearGarage();
//		System.out.println(g.toString());
	}
}
		
		