package com;
import java.util.Scanner;

public class FabonacciSeries {
	
	public static void main(String[] args) {
		
	int a;
	int b;
	int c;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number");
	a=sc.nextInt();
	System.out.println("Enter the second number");
    b=sc.nextInt();
    c=a+b;
    System.out.print(c+" ");
    for(int i=0;i<=11;i++)
    {
    	
    	a=b;
    	b=c;
    	c=a+b;
    	System.out.print(c+" ");
    }
}
}
