package com.java;

public class MethodOverloadingExample {
	//Method overloading: same method name with different data type of arguments 
	public int add(int a, int b)
	{
		int c = a+b;
		return c;
		} 
	public double add(double a, double b)
	{
		double c = a+b; return c; 
		} 
	public static void main(String args[])
	{
		MethodOverloadingExample a1 = new MethodOverloadingExample();
		System.out.println(a1.add(5, 5));
		System.out.println(a1.add(1.5, 5.5));
		}

}
