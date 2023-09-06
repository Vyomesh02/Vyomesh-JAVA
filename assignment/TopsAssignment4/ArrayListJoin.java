package com.TopsAssignment4;

import java.util.ArrayList;

public class ArrayListJoin {

	public static void main(String[] args) {
		ArrayList a1= new ArrayList();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		System.out.println("First List  : "+a1);
		
		ArrayList a2 = new ArrayList();
		a2.add(6);
		a2.add(7);
		a2.add(8);
		a2.add(9);
		a2.add(10);
		System.out.println("Second List : "+a2);
		
		//Join Two array List
		a1.addAll(a2);
		System.out.println("Join List   : "+a1);
		
	}

}
