package com.TopsAssignment4;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
		ArrayList firstList = new ArrayList();
		firstList.add("AA");
		firstList.add("BB");
		firstList.add("CC");
		firstList.add("DD");
		System.out.println("First List : "+firstList);
		
		ArrayList secondList = new  ArrayList();
		secondList.add("AA");
		secondList.add("BB");
		secondList.add("CC");
		secondList.add("EE");
		System.out.println("Second List : "+firstList);
		

	//compare both list	
		boolean b=firstList.equals(secondList);
		if(b) {
			System.out.println("Both lists are Equals....");
		}
		else {
			System.out.println("Both lists are not Equals....");
		}
	}

}
