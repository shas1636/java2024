package com.java;

public class ArrayExample {

	public static void main(String[] args) 
	{

			 //Normal variable declaration 
//		int a = 10;
//		//Array creation int array1[];
//		array1 = new int[5];
//		
//		//Syntax 2
//		int array2[] = new int[5];
//		
//		//Syntax 3
//		int []array3;
//		array3 = new int [10];
		
		//Syntax 4
		int array4[] = {10,20,30,40,50};
		System.out.println("The size of Array 4 is ->" + array4.length);
		System.out.println("The first element of Array 4 is ->" + array4[0]);
		
		//The negatvie scenario
		//System.out.println("The first element of Array 4 is ->" +array4[5]);  // Index 5 out of bounds for length 5
		System.out.println("The size of Array 2 is->" + array4.length); 
		
		
		
		System.out.println("The size of Array 2 is->" +ArrayTWO.length); 
		String TeamIndia[] = {"Dhoni", "Kohli","Yuvraj","Kaif"}; 
		System.out.println("The size of Team India Array is" +TeamIndia.length); 
		System.out.println("Kaif is in the location of" +TeamIndia[3]); 
		for(int i=0;i<TeamIndia.length;i++)
		{ 
			System.out.println(TeamIndia[i]); }
		 }

	}

