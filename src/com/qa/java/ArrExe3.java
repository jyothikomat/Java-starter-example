package com.qa.java;

public class ArrExe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[10];

		numbers[0] = 11;
		numbers[1] = 22;
		numbers[2] = 33;
		numbers[3] = 44;
		numbers[4] = 55;
		numbers[5] = 66;
		numbers[6] = 77;
		numbers[7] = 88;
		numbers[8] = 99;
		numbers[9] = 109;

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers[i] * 10;
			System.out.println(numbers[i]);
		}

	}

}
