package com.java;

public class MethodsExample
{
	//1. Normal method: Access specifier, Return type, Name of the method
	public void NormalMethod()
	{
		System.out.println("Void method is printed");
	}
	
	//2. Second method: Method with return type: Access specifier, Return type(data type: int, float), Name for the method. 
	public int addtwonumber()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		return 9;
	}
	
	//3. Methods with parameter:we can pass the value dynamically here in this type of method 
	public int addtwovalues(int a, int b)
	{
		int result=a+b;
		System.out.println(result);
		return result;
		
	}
	
	public int maxmarks()
	{
		return 100;
		
	}

	public static void main(String[] args) 
	{
		MethodsExample obj1=new MethodsExample();
		obj1.NormalMethod();
		obj1.addtwonumber();
		obj1.addtwovalues(100,200);
		System.out.println(obj1.maxmarks());
	}

}
