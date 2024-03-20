package com.java;

public class SwitchStatementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day =1; // or put 100 and value will be not defined 
		String weekday = "Not Defined"; 
		
		switch(day)
		{
		case 1: weekday ="Monday";
		break; 
		
		case 2: weekday ="Tuesday";
		break;
		
		case 3: weekday ="Wednesday";
		break; 
		}
		
		System.out.println(weekday); 
		}

	}


