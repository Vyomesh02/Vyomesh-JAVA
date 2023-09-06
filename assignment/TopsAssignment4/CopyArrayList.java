package com.TopsAssignment4;

import java.util.ArrayList;
import java.util.Collections;

public class CopyArrayList {

	public static void main(String[] args) {
		ArrayList<String> carList = new ArrayList<>();
		carList.add("BMW");
		carList.add("Audi");
		carList.add("Hyundai");
		carList.add("Honda");
		carList.add("Mercedes");
		carList.add("Mahindra");
		carList.add("TATA");
		
		System.out.print("Original Array list : ");
		System.out.println(carList);
		ArrayList<String> copyArray = new ArrayList<>();
	    copyArray=(ArrayList<String>) carList.clone();
		System.out.print("Copied Array List : ");
		System.out.print(copyArray);
		
		

		
	}

}
