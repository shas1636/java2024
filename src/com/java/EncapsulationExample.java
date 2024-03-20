package com.java;

public class EncapsulationExample {
	
	 //Public, Private, Protected, Default 
	//public means i can access it anywhere inside the java project 
	public void PublicMethod()
	{
		System.out.println("Priting Public Method");
		}
	
	//private means i can access only inside the class and not anywhere else
	//private method cannot be accesses even in the other class in the same file 
	//but all other 3 can be accessed inside the other class
	private void PrivateMethod() 
	{
		System.out.println("Priting Private Method");
		}
	//protected can be called inside the same class and inside the same package 
	//and outside the package but in derived class(extended)
	protected void ProtectedMethod()
	{
		System.out.println("Protected Method");
		}
	
	//default can be used within the same class and within the same package and not anywhere else
	//do not need to specify access specifier in it 
	//only return type and method name 
	
	void DefaultMethod() 
	{
		System.out.println("Default Method");
		}
	public static void main(String args[])
	{
		EncapsulationExample e1 = new EncapsulationExample();
		e1.PublicMethod();
		e1.PrivateMethod();
		e1.ProtectedMethod(); 
		e1.DefaultMethod(); 
		}

}
