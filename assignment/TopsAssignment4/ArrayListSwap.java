package com.TopsAssignment4;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSwap {

	public static void main(String[] args) {
		ArrayList firstList = new ArrayList();
		firstList.add("AA");
		firstList.add("BB");
		firstList.add("CC");
		firstList.add("DD");
		System.out.println("Original List : "+firstList);
		
		//swap array list
		Collections.swap(firstList, 1, 2);
		System.out.println("After swap List : "+firstList);
		

	
		
	}

}
