package com.TopsAssignment4;

import java.util.ArrayList;

public class ArrayListSizeIncrese {

	public static void main(String[] args) {
		ArrayList a1= new ArrayList();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		System.out.println("Array list   : "+a1);
		//capacity is 5 size is also 5
		System.out.println("Size of List : "+a1.size());
		//now size is 5 but capacity is 20
		a1.ensureCapacity(20);
		System.out.println("Size of List : "+a1.size());

	}

}
