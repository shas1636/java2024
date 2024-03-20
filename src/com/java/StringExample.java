package com.java;

public class StringExample {
	public static void main(String args[])
	{
		String MyBatch="My batch members are brilliant";
		String Grade="And graded A";
		//charat method is used to get the exact charcater from the index location
		System.out.println(MyBatch.charAt(0));
		
		//This will convert my string into upper case
		System.out.println(MyBatch.toUpperCase());
		
		//to lower case 
		System.out.println(MyBatch.toLowerCase());
		
		//Very important in automation
		//we use contains method to check if th word is present in the string 
		System.out.println(MyBatch.contains("are"));
		
		//concatenate
		String joinedString=MyBatch.concat(Grade);
		System.out.println(joinedString);
		
		//to get the length of the string
		System.out.println(MyBatch.length());
		
		String student1="malar";
		String student2="Malfar";
		if(student1.equalsIgnoreCase(student2))
		{
			System.out.println("Student names are equal");
		}
		else
		{
			System.out.println("Student names are not equal");
		}
		
	}

}
