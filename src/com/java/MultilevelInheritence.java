package com.java;

class Animal
{
	int numberofLegs = 4; 
	
public void Eat()
{
	System.out.println("Animals Eat");
	}

} 

//Single Inheritance 
class Dog extends Animal
{
	public void DogMethod()
	{
		System.out.println("This is dog here and I eat Bones");
		} 
	}


//multilevel inheritance 
class Puppy extends Dog
{
	  public void PuppyMethod()
	 { 
		 System.out.println("This is puppy here and I drink milk");
	 } 
}	  




public class SingleInheritenceExample
{
	public static void main(String args[]) 
	{
	
		Puppy p1=new Puppy();
		p1.PuppyMethod();
		p1.Eat();
		p1.DogMethod();
		
		
		} 
}


//Puppy extends dog and dog extends animal. This is called parent, grand parent child relation over here 
