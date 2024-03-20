package com.java;

public class ParameterisedConstructor {

	//parameterised constrcutor
	 ParameterisedConstructor(int a, int b) 
	 {
		 int c=a+b;
		 System.out.println(c);
		 System.out.println("parameterised constructor");
	 }
	 
	 public static void main(String args[])
	 {
		 ParameterisedConstructor c1=new ParameterisedConstructor(10, 10);
	 }
}

//why we use constrcutor in automation world. page pbject model
//same constrctor with different parameter data types is called constrcutor overloading 
