package com.java;

public class MethodOverridingExample {
	
	
	class Vehicle_Maruti
	{ 
		public void run()
		{
			System.out.println("Parent uses Maruti");
			}
		public void carcolor()
		{
			
		} 
		public void Eat()
		{
			System.out.println("Eating good foods");
			}
		}
	
	
	class Vehicle_BMW extends Vehicle_Maruti
	
	{
		//Overiding or overusing the same method name which is declared in the parent class
		public void run() 
		{
			System.out.println("I am using BMW");
			}
		
		public void Eat()
		{
			System.out.println("Eating Junk Foods");
			}
		}
	
	
	public class MethodOverridingExample
	{
		public static void main (String args[])
		{
			Vehicle_BMW b1 = new Vehicle_BMW();
			b1.run();
			b1.carcolor();
			b1.Eat();
			}
		}
	}


