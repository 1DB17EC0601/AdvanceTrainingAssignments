package com;

import java.util.Scanner;

public class Rectangle {
	
	double length;
	double width;
    double result;
	
	public Rectangle()
	{
		length=0;
		width=0;
		result=0;
	}
	
	void input() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the lenth of a rectangle");
		length=sc.nextDouble();
		System.out.println("Enter the lenth of a rectangle");
		width= sc.nextDouble();		
		}
		
	

     void areaOfRectangle()
     {
        	result=length*width;
     }
     
     void display()
     {
    	 System.out.println("The area of a reactangle is "+result);
     }
     }
	


