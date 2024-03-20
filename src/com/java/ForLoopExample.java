package com.java;

public class ForLoopExample {

	public static void main(String[] args) {
		//normal for loop 
		//start the initial value 
		//condition until it has to be iterated 
		//give increment operator 
		for(int i=1;i<=5;i++)
		{ 
			System.out.println(i);
			}
		System.out.println("comes out of for loop");
		
		//Nested for loop
		for(int i=8;i<=10;i++)
		{ 
			for(int j=0;j<=5;j++) 
			{
				System.out.println("Child Nested For Loop"+j); 
				} 
			System.out.println("The Parent For loop - "+i);
			}
		
		
		//Nested For loop pyramid program
		for(int i=1;i<=5;i++)
		{ 
			for(int j=1;j<=i;j++)
			{ 
				System.out.print("@"); 
				} 
			System.out.println();
			}
		
		//enhanced for loop 02:05 min (02 April 2023)
		String TeamIndia[] = {"Dhoni", "Kohli","Yuvraj","Kaif"};
		for(String payal:TeamIndia)
		{ 
			System.out.println(payal);
			}

	}

}
