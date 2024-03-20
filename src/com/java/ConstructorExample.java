package com.java;

public class ConstructorExample {
	
	//Normal method
	public void print()
	{
		System.out.println("Normal method");
	}
	
	//constructor is a basically the default method for your class
	
	
	//constructor does not have access specifier and return type. it simply contains name that is the class name 
	ConstructorExample()
	{
		System.out.println("this is a constructor");
	}
	
	//parameterised constrcutor 
	ConstructorExample(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
		System.out.println("parameterised constructor");
	}
	
	//constructor overloading : When we pass different parameters of different data types 
	// if we change the paramter then it is constructor overloading else it is constructor with parameter 
	
	ConstructorExample(int a, String b)
	{
		System.out.println("Constrcutor overloading");
		System.out.println("The roll number is "+a);
		System.out.println("The name of student: "+b);
	}
	public static void main(String args[])
	{
		ConstructorExample c1=new ConstructorExample();
		ConstructorExample c2=new ConstructorExample(5,5);
		ConstructorExample c3=new ConstructorExample(10,"hey");
		
	}

}
