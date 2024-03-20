package com.java;

public class VariablesExample {
		 //Global Variable Declaration 
		int a = 10;
		int globalvariable = 20;
		
		public void print()
		{
			//local variable declaration
			int a =30;
			System.out.println("***Print Method***");
			System.out.println("Print 1");
			System.out.println("Local variable:" +a);
			System.out.println("Global variable:" +globalvariable); 
			}
		
		public static void main(String args[])
		{ 
			int  a = 40; 
			//Syntax - Class Name + object name = new + ClassName(); 
			VariablesExample obj1 = new VariablesExample(); 
			System.out.println(obj1.a);
			System.out.println(obj1.globalvariable); 
			obj1.print();
//			System.out.println(a);
		}
		


	}


