package com.qa.java;

public class Runner {

	public static void main(String[] args) {
		
		double result = Calculator.add(5.5, 5.5);
		System.out.println(result);
		System.out.println(Calculator.sub(5.5, 5.5));
		System.out.println(Calculator.mul(5, 2));
		System.out.println(Calculator.div(5, 5));
		System.out.println(Calculator.mod(5, 5));
	}
}
