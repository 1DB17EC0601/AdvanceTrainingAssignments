package com;

public class Book {
	
	private String bookTitle;
	private double bookPrice;
	
	
	
	public Book() {
		
		bookTitle=null;
		 bookPrice=0;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	
	
}
