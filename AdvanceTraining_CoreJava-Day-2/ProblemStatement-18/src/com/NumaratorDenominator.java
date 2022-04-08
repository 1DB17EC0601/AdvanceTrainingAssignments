package com;

import java.util.Scanner;

public class NumaratorDenominator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the numerator Value");
		int a = sc.nextInt();
		System.out.println("Enter tge Denominator value");
		int b = sc.nextInt();
		
		double res=(double)a/b;
		System.out.println(res);
		
	}

}
