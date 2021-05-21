package com.qa.java.encapsulation;

public class Book {

	 // Attributes
    public String title;
    public String author;
    public String genre;
    public String edition;
    public int pageCount;
    public boolean isOpen;
    
    // Constructor
    public Book(String title, int pageCount, String edition) {
        this.title = title;
        this.pageCount = pageCount;
        this.edition = edition;
    }
    
    // Methods
    public void open() {
        this.isOpen = true;
    }
    
    public void close() {
        this.isOpen = false;
    }
}

