package com;

public class StringHandling {
	
	public static void main(String[] args) {
		
		String str= "JAVA is Simple";
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.charAt(0)+" "+str.charAt(5)+" "+str.charAt(8));
		String[] s=str.split(" ");
		
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+" ");
		}
		StringBuilder s1= new StringBuilder(str);
		
		
		System.out.println();
		System.out.println(s1.reverse());
		System.out.println(str.length());
	
	}

}
