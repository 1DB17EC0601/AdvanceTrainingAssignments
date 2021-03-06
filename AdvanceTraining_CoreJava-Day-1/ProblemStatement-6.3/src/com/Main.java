package com;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
	
	
	public static LinkedList<Employee> addInput()
	{
		Employee e1= new Employee(101, "mallapp", "Kalaburagi");
		Employee e2= new Employee(102, "chandru", "bidar");
		Employee e3= new Employee(103, "malappa", "yadgir");
		Employee e4= new Employee(104, "naveena", "Raichur");
		
		LinkedList<Employee> v = new LinkedList<Employee>();
		
		v.add(e1);
		v.add(e4);
		v.add(e2);
		v.add(e3);
		
		return v;
		
	}
	
	public static void displayAll(LinkedList<Employee> v)
	{
		for(Employee a: v)
		{
			System.out.println(a.geteId()+"\t"+a.geteName()+"\t"+a.geteAdd());
		}
		
	}
	
	public static void main(String[] args) {
		
		LinkedList<Employee> v= addInput();
		
		displayAll(v);
		
		
	}

}
