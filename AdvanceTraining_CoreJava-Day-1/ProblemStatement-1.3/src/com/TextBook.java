package com;


import java.util.Scanner;
public class TextBook {
	
	  
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the bookname");
			String bName=sc.next();
			
			System.out.println("Enter the bookprice");
			double bprice=sc.nextDouble();
			
		
			Book b = new Book();
			b.setBookTitle(bName);
			b.setBookPrice(bprice);
			
			System.out.println("The Book Details");
			
			System.out.println("BookName-------BookPrice");
			System.out.println(b.getBookTitle()+"-------------"+b.getBookPrice());
			
		}
	
}







