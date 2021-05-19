package com.qa.java;

public class StringsExe1 {

	public static void main(String[] args) {

		String str1 = "yesterday it was raining";
		String str2 = "today it is sunny";
		String substr1 = str2.substring(0, 11);
		String substr2 = str1.substring(17, 24);

		/*
		 * str1=str1.toUpperCase();
		 *  str2=str2.toUpperCase();
		 */

		System.out.println(str1.toUpperCase() + " " + str2.toUpperCase());

		System.out.println(substr1.toUpperCase() + " " + substr2.toUpperCase());

	}

}
