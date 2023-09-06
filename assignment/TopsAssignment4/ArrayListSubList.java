package com.TopsAssignment4;

import java.util.ArrayList;

public class ArrayListSubList {

	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<>();
		color.add("Red");
		color.add("Green");
		color.add("Yellow");
		color.add("Blue");
		color.add("Black");
		
		System.out.println(color);
   //Add at first index
		color.add(0, "White");
		System.out.println(color);
   //Retrive at Any index
		color.get(2);
		System.out.println(color.get(2));
   //update elements at any index
		System.out.println(color);
		color.set(4, "Purple");
		System.out.println(color);
	//remove third element
		color.remove(2);
		System.out.println(color);
	//search element 
		boolean b=color.contains("White");
		System.out.println(b);
	}

}
