package com.java;

public class IfElseExample {

	public static void main(String[] args) {
		 int a = 10;
		 int b = 20; 
		 int c = 30; 
		 if(a>b)
		 { 
			 System.out.println("A is greater than B");
			 } 
		 else if(a>c) 
		 { 
			 System.out.println("A is greater than C");
			 } 
		 else if(a<b)
		 { 
			 System.out.println("A is lesser than B"); 
			 } 
		 else if(a<c)
		 { 
			 System.out.println("A is lesser than C");
			 } 
		 else 
		 {
			 System.out.println("All the conditions are checked"); 
			 } 
		 
		 //Nested if statement 
		 if(a<b) 
		 {
			 System.out.println("Inside nested if");
			 if(a<c)
			 {
				 System.out.println("A is lesser than c in Nested if");
				 }
			 }
		 

	}

}
