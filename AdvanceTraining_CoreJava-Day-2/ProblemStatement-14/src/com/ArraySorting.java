package com;

import java.util.Arrays;

public class ArraySorting {
	
	
	      public static void sortedMerge(int[] a,int[] b)
	      {
	    	  int n=a.length,m=b.length;
	    	  int[] c= new int[a.length+b.length];
	    	  
	    	  for(int i=0;i<n;i++)
	    	  {
	    		  
	    		  c[i]=a[i];
	    		  
	    	  }
	    	  for(int j=0;j<m;j++)
    		  {
    			 c[n+j]=b[j]; 
    		  }
	    	  Arrays.sort(c);
	    	  for(int i=0;i<c.length;i++)
	    	  {
	    		  System.out.println(c[i]+" ");
	    	  }
	      }
	
	
	
	public static void main(String[] args) {
		
		int[] a= {1, 3, 2, 6, 7, 9, 5, 4};
		int[] b = {6, 5, 3, 1, 8, 9, 4, 6};
		
		ArraySorting.sortedMerge(a,b);

}
}
