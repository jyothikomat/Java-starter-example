package com.qa.java.encapsulation;



public class BookRunner {

	public static void main(String[] args) {
		
		Person bob = new Person("Bob", 32, "male");
		Person personVar = new Person("Charlotte", 30, "female");
		Person trainer = new Person("Alan", 32, "male");
		Book bk = new Book("Polaris", 100, "edi1");
		bob.read(bk);

	}

}
