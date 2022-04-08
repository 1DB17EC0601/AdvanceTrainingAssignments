package com;

public class ArraySorting {
	
	  public static void FirstRepeatingElement(int[] arr, int n) { 
	
     for(int i = 0; i < arr.length; i++){     
         for(int j = i+1; j < arr.length; j++){  
             if(arr[i] == arr[j]){ 
            	 System.out.println("The First repeating element in an given array is "+arr[i]);
            	 break;
             }else {
            	 int j1=j;
            	 for(j1 = i+1; j1 < arr.length; j1++){  
                     if(arr[i] == arr[j1]){ 
                    	 System.out.println("The First repeating element in an given array is "+arr[i]);
                     }
            		 
            	 }
            	
            		 
              
             System.out.println("Entered");
             
         } 
         break;
         }
     }
       
  }

	  
	  
	  
	  
	 public static void main(String[] args) {  
				System.out.println("Started"); 
		 int a[] = {1, 2, 3, 4, 5, 2, 4, 6 };
	      int n=a.length;
	      
	      ArraySorting.FirstRepeatingElement(a, n);
	      System.out.println("Executed Succesfully");
}
}
