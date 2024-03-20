package com.java;

public class StaticExample {

	public static int a = 10;

	public void print() {
		System.out.println("Normal Method");
	}

	public boolean Results() {
		return true;
	}

	public static void staticPrint() {
		System.out.println("Priting Static Method");
	}

	public static void main(String args[]) {
		StaticExample obj1 = new StaticExample();
		obj1.print();
		System.out.println(obj1.Results());
		staticPrint();
		System.out.println(a);
	}

}
//Static keyword is used to call the methods directly inside the class wihtout creating an object for it 
// in outside the class we call it by classname.staticmethodname.
