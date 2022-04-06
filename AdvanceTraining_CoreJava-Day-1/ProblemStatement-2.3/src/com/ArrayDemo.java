package com;

public class ArrayDemo {
	
	public static void main(String[] args) {
		int sum=0;
		int arr[] = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};
		
		for(int i=0;i<15;i++)
		{
			sum=sum+arr[i];
			
		}
		//sum of all elememts upto position 14
		System.out.println(sum);
		//storing the sum to position 15
		arr[15]=sum;
		System.out.println(arr[15]+" ");
		//finding average of all the elements 
		System.out.println(sum/arr.length);
		
		
	}

}
