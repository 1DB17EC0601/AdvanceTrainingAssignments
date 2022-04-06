package com;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class File {
	
	   void  file()
	    {
	        try{
	        FileReader fr = new FileReader("output.txt");
	        String str = "";
	        int i;
		    while ((i = fr.read()) != -1)str += (char)i;
		    System.out.println("Data Stored in file : \n"+str);
	    }
	    catch(Exception e)
	    {
	        System.out.println(e);
	    }
	}
	}

	



