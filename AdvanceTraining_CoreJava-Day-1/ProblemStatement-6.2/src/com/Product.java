package com;

import java.util.*;

public class Product {
	
	public static void main(String args[]){  
		
		Scanner sc = new Scanner(System.in);
		
		  //Creating HashMap and adding elements  
		    Hashtable<Integer, String> set=new Hashtable<Integer,String>();  
		    
		    System.out.println("Enter the Products to be added along with the product id");
		    
		    for(int i=0;i<3;i++)
		    {
		    	set.put(sc.nextInt(), sc.next());
		    }
		    
		    System.out.println(set);
		    
		    System.out.println("Enter the product to be removed");
		    int id=sc.nextInt();
		    
		    set.remove(id);
		    System.out.println("Removed Succesfully");
		    
		    System.out.println(set);
		    
		    System.out.println("Enter the id to be searched");
		    int search = sc.nextInt();
		     
		    
		    
		    if(set.containsKey(search))
		   System.out.println(set.get(search));
		    else
		    	System.out.println("the id doesnot exist");
		            
		 }  
}
