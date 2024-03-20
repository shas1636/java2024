package com.java;

//one child is inheriting from 2 parents .. calling multiple interface n class to support multiple inheritance.
//using implemt keyword we call a interface to use all the methods or rules defined inside the interface 

public class InterfaceExampleEce implements InterfaceCollege,CollegeOfficeDetails{ 

	@Override
	public void StudentDetails() {
		// TODO Auto-generated method stub
		System.out.println("print the ece student details");
	}

	@Override
	public void StudentResults() {
		// TODO Auto-generated method stub
		System.out.println("print the  ece student results");
		
	}

}
