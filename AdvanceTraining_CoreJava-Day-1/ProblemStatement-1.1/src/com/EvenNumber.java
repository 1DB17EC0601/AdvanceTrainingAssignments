package com;

import java.util.Scanner;

public class EvenNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		//traverse all the numbers using for loop
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
	
	}
	

}
