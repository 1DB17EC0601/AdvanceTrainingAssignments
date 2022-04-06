package com;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		
		String name;
		String rev="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		name=sc.nextLine();
		
		System.out.println("The length of String is "+name.length());
		System.out.println("converted to uppercase "+name.toUpperCase());
		
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		
		if(rev.equals(name))
			System.out.println("the given string is palindrome");
		else
			System.out.println("the given string is not a palindrome");
	}
	

}
