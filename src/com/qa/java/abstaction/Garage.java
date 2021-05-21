package com.qa.java.abstaction;

import java.util.ArrayList;

import java.util.List;

public class Garage {

	private ArrayList<Vehicle> allVehicles = new ArrayList<>();

	public Garage() {

	}

	public void addVehicle(Vehicle a) {
		allVehicles.add(a);
	}

	public void removeVehicle(int a) {
		for (int i = 0; i < allVehicles.size(); i++) {
			Vehicle v = allVehicles.get(i);
			if (v.getId() == a) {
				allVehicles.remove(i);
				i--;
			}
		}
	}

	public void removeVehicle(String a) {
		for (int i = 0; i < allVehicles.size(); i++) {

			if (a.equals(allVehicles.get(i).getType())) {
				allVehicles.remove(i);
				i--;
			}
		}
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < allVehicles.size(); i++) {
			s = s + "\n" + allVehicles.get(i).toString();
		}
		return s;
	}

	public void showGarage() {
		System.out.println("Garage Inventory: \n");
		for (int i = 0; i < allVehicles.size(); i++) {
			System.out.println(allVehicles.get(i).toString());
			System.out.println(" ");
		}

	}

	public double showTotalRepairBills() {
		double totalBill = 0;

		for (int i = 0; i < allVehicles.size(); i++) {
			double a = allVehicles.get(i).repairbill();

			totalBill = totalBill + a;
		}
		return totalBill;
	}
	

	public void clearGarage() {
		allVehicles.clear();

	}
}
