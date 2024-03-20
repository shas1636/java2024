package com.java;

public class OperatorsExample {

		public int addTwoNumbers(int a, int b)
		{
			int c = a+b;
			return c;
			}
		
		public boolean checktwonumbers(int x, int y)
		{
			if(x<y)
			{
				System.out.println("X is lesserr than Y");
				}
			return true;
			
		}
		
		public static void main(String args[])
		{
			//Arithmetic operators
			int a = 10;
			int b =20;
			int c = a+b;
			int d = a-b;
			int e = a*b;
			int f = a/b; 
			int g = a%b; //Modular
//			System.out.println(c);
//			System.out.println(d);
//			System.out.println(e);
//			System.out.println(f);
//			System.out.println(g);
			OperatorsExample a1 = new OperatorsExample();
			System.out.println(a1.addTwoNumbers(a, b));
			
			//Relational Operators 
			int x = 10; 
			int y =20; 
			int z = 30; 
			int J = 10; 
			if(x>y)
			{ 
				System.out.println("X is greater than Y");
			}
			if(x<y)
			{
				System.out.println("X is lesserr than Y");
				}
			if(x==J)
			{ 
				System.out.println("X and J are Equal");
				}
			if(x!=z) 
			{ 
				System.out.println("X is not equal to Z");
				}
			System.out.println(a1.checktwonumbers(x, y));
			
			
			//Logical conditions example 
			System.out.println("*** Logical Condition Example***");
			if(x<y && x<z)
			{
				System.out.println("X is lesser than Y and Z"); 
				}
			if 
			(x<y && x>z)
			{ 
				System.out.println("X is lesser than y and greater than Zs");
				} 
			if (x<y || x>z) 
			{ 
				System.out.println("X is lesser than y and greater than Z using or operator");
				}
			
			System.out.println("***Unary Operators***");
			int unaryexample = 10; 
			System.out.println(unaryexample++);//Output will be 10, but in the memeory it will be increamented to 11 
			System.out.println(unaryexample);
			System.out.println(++unaryexample);//The value in memeory is 11 since we give the ++ operator first it increments 12 
			System.out.println(unaryexample--); 
			System.out.println(unaryexample); 
			System.out.println(--unaryexample);
			
			}
		}
//Notes here below:
/*You can define the method as static but you cannot define the variable inside the methods as static as Static go with the class level 
The static variable in java can be declared like class members of the class like static int number, 
is the valid declaration of the static variable but static variables cannot be declared inside any method scope.
If we try to declare static variables inside any method, the compiler will show a syntax error.*/