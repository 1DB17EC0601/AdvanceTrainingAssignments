package com;

import java.util.Scanner; 

public class MainClass {
	
	 public static void main(String[] args) {
		
		
		Instrument p = new Piano();
		p.play();
		Instrument g= new Guitar();
		g.play();
		Instrument f=new Flute();
		f.play();
		Piano p1 = new Piano();
		Guitar g1= new Guitar();
		Flute f1 = new Flute();
		
		System.out.println(p1 instanceof Piano); 
		System.out.println(g1 instanceof Guitar);
		System.out.println(f1 instanceof Flute); 
		System.out.println(f instanceof Flute);
		System.out.println(p instanceof Piano); 
		System.out.println(g instanceof Guitar);
	}
}
