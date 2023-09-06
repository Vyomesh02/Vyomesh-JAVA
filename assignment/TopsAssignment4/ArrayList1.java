package com.TopsAssignment4;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> clrList = new ArrayList<>();
		clrList.add("Red");
		clrList.add("Green");
		clrList.add("Yellow");
		clrList.add("Blue");
		clrList.add("Black");
		System.out.println("Original List :"+clrList);
		
		List<String> sub_list=clrList.subList(2, 4);
		System.out.println("Sub List : "+sub_list);
		boolean b=sub_list.equals(clrList);
		System.out.println(b);
		
	}

}
