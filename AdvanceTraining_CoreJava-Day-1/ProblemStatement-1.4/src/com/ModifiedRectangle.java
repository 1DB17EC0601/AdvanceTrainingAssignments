package com;
import java.util.Scanner;

public class ModifiedRectangle {
	
	    int length; 
	    int width; 
	    int area; 
	    int parameter;
	    
	    public int getLength() {
			return length;
		}

		public void setLength(int length) {
			this.length = length;
		}

		public int getWidth() {
			return width;
		}

		public void setWidth(int width) {
			this.width = width;
		}

		
	    public ModifiedRectangle()
	    {
	    	length = 1;
	    	width= 1;
	    }

	    void input() {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter length of rectangle: ");
	        length = in.nextInt();
	        System.out.print("Enter width of rectangle: ");
	        width = in.nextInt();
	    }
	    
	    void  areaRectangle()
	    {
	        area = length * width;
	       
	    }
	 
	     void  perimeterRectangle()
	    {
	    	 parameter = 2*(length + width);
	       
	    }

	    void display() {
	    	if(length>0 && length<20)
	        {
	        System.out.println("Area of Rectangle = " + area);
	        System.out.println("Parameter of Rectangle = " +parameter);
	        } else
	        	System.out.println("Invlaid credentials....!");
	       
	        }

	    public static void main(String args[]) {
	    	
	    	ModifiedRectangle obj1 = new ModifiedRectangle();
	        obj1.input();
	        obj1.areaRectangle();
	        obj1.perimeterRectangle();
	        obj1.display();
	        System.out.println("****************************");
	        ModifiedRectangle obj2 = new ModifiedRectangle();
	        obj2.input();
	        obj2.areaRectangle();
	        obj2.perimeterRectangle();
	        obj2.display();
	        System.out.println("****************************");
	        ModifiedRectangle obj3 = new ModifiedRectangle();
	        obj3.input();
	        obj3.areaRectangle();
	        obj3.perimeterRectangle();
	        obj3.display();
	        System.out.println("****************************");
	        ModifiedRectangle obj4 = new ModifiedRectangle();
	        obj4.input();
	        obj4.areaRectangle();
	        obj4.perimeterRectangle();
	        obj4.display();
	        System.out.println("****************************");
	        ModifiedRectangle obj5 = new ModifiedRectangle();
	        obj5.input();
	        obj5.areaRectangle();
	        obj5.perimeterRectangle();
	        obj5.display();
	    	
	    }
	}

