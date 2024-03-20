package com.collectionsExample;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListInterfaceExamples {
	
	public static void main(String args[])
	{
		//list is interface name and ArrayList is class name
		//then import list and arraylist
		//we are creating list to save some values 
		List a1= new ArrayList();
		
		a1.add("kerela");
		a1.add("banglore");
		a1.add("pune");
		a1.add("delhi");
		
		
		System.out.println("printing the elements in the list");
		System.out.println(a1);
		
		//using iterator we traverse into the list forward and backard 
		
		ListIterator<String> itr= a1.listIterator();
		
		System.out.println("printing in forward order ");
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//to do in backwad direction
		System.out.println("Printing from reverse order");
		while (itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}

}
