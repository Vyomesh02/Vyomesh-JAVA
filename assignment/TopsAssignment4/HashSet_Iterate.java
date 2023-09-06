package com.TopsAssignment4;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Iterate {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("Red");
		hs.add("Green");
		hs.add("Yellow");
		hs.add("Blue");
		hs.add("Pink");
		hs.add("Black");
		System.out.print("HashSet  : ");
		System.out.println(hs);
	    int noOfElements = hs.size();
	    System.out.println("Size of HashSet : "+noOfElements);
	    
	    System.out.println("Elements of HashSet are : ");
	   Iterator<String> it =hs.iterator();
	   while(it.hasNext())
	   {
		   System.out.println(it.next());
	   }

		
		
	}

}
