package com;

public class SmallestElement {
	
	public static void main(String[] args) {
		
		int arr[] = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};
		int small=arr[0];
		
		//finding the smallest element in an given array 
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<small)
				small=arr[i];
		}
		
		System.out.println("the smallest element of s given array is "+small);
		//storing it to index number 17
		arr[17]=small;
		System.out.println("The element at the arr[17] place is "+arr[17]);
		
	}

}
