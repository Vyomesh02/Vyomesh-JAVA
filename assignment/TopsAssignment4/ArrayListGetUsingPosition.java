package com.TopsAssignment4;

import java.util.ArrayList;

public class ArrayListGetUsingPosition {

	public static void main(String[] args) {
		ArrayList<String> frndList = new ArrayList();
		frndList.add("Vyomesh");
		frndList.add("Anant");
		frndList.add("Parin");
		frndList.add("Jaivik");
		frndList.add("Deepak");
		
		System.out.println("ArrayList elements : "+frndList);
		int size=frndList.size();
		System.out.println("ArrayList print using index : ");
		for (int i = 0; i < size; i++) {
			System.out.println(frndList.get(i));
		}
	}

}
