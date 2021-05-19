package com.qa.java;

public class Book {

	public String title;
	public String author;
	public String category;
	//public date releasedate;
	//constructor
	public Book(String title, String author, String category) {
		this.title = title;
		this.author = author;
		this.category = category;
	}
	public void create() {
		System.out.println("created new book");
		
	}
}

