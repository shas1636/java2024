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


//herarchical inheritance 
// here animal has 2 child one is cat and 1 is dog
class Cat extends Animal
{
	public void CatMethod()
	{
		System.out.println("this is cat here and I also drink milk");
	}
}




public class HerarchyInheritance
{
	public static void main(String args[]) 
	{
	Cat c1=new Cat();
	c1.Eat();
	c1.CatMethod();
		
		} 
}