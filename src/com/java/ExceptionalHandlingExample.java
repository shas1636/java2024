package com.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionalHandlingExample {
	
//"checked exception" happens during your compilation time,
	//in this scenario file io is the exception thrown
	//throws vs throw 
	public void OpenFile() throws FileNotFoundException, InterruptedException
	{
		File file=new File("D://NewFile.txt");
		
		FileInputStream ft=new FileInputStream(file);
		Thread.sleep(5000);
	}
	
	public static void main(String args[])
	{
		//This exception where the program stops abrtubtly without running the next set of code (unchecked exception)
		//In try block we give the code which we feeel it might throw an error during running
		try 
		{
			int a = 10;
			int b = 0;
			int c = a/b;
			} 
		
		//We will catch the exception and execute the program further
		catch(Exception MathError)
		{ 
			System.out.println(MathError); 
			}
		//finally block will be executed even if the error accours or not
		finally
		{
			System.out.println("Finally code: executing code even after ecception");
		}
		System.out.println("The line of code after the error"); 
		int d = 10+10;
		System.out.println(d);
		
		//_________________________________________________________________________
		int e= 20; 
		int f = 10; 
		if(e>f) 
		{
			//throw keywords used to throw single exception
			throw new ArithmeticException("E is greater than f");
			}
		else 
		{
			System.out.println("E is lesster than f");
			}
		}
		
	}
	


