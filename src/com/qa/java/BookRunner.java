package com.qa.java;



public class BookRunner {

	public static void main(String[] args) {
		
		Person bob = new Person("Bob", 32, "male");
		Person personVar = new Person("Charlotte", 30, "female");
		Person trainer = new Person("Alan", 32, "male");
		Book bk = new Book("Polaris", "mrpolar", "earth");
		bob.read();

	}

}
