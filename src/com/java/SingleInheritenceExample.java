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
		public class SingleInheritenceExample
		{
			public static void main(String args[]) 
			{
				//Animal a1 = new Animal(); 
				//a1.Eat(); 
				Dog d1 = new Dog(); 
				d1.DogMethod();
				d1.Eat();
				System.out.println(d1.numberofLegs);
				} 
	}


