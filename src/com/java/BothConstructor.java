package com.java;

public class BothConstructor {
	
	public void print()
	{
		System.out.println("Normal Method");
		}
	//Default method for your class
	public BothConstructor() {
		// TODO Auto-generated constructor stub
	}
	{
		System.out.println("This is a constructor");
		}
	//Parametrized Consturcotor
	ConstructorExample(int a, int b)
	{ 
		int c = a+b; 
		System.out.println(c); 
		System.out.println("Parameterized Constructor");
		}
	public static void main(String args[])
	{ ConstructorExample c1 = new ConstructorExample();
	ConstructorExample c2 = new ConstructorExample(5,5); 
	}

}
