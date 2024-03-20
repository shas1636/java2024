package com.java;

public class TestCollege {
	public static void main(String args[])
	
	{
		//InterfaceCollege is interface name and collegeName is string name and we didnt mention it static inside the interface name as static 
		//by default interface variables are always static 
		System.out.println(InterfaceCollege.collegeName);
		
		//interface objectname= new (all the interface method i have implemented in cse class itself 
		//here we created an object for an interface with respect to cse implemented clss
		
		InterfaceCollege cse=new InterfaceExampleCs();
		cse.StudentDetails();
		cse.StudentResults();
		
		
		InterfaceCollege ece=new InterfaceExampleEce();
		ece.StudentDetails();
		ece.StudentResults();
		
		
	}
	
	

}
