package com.TopsAssignment4;

import java.util.ArrayList;
import java.util.HashSet;

public class hashSetTo_Array {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet();
		hset.add("A");
		hset.add("B");
		hset.add("C");
		hset.add("D");
		hset.add("E");
		
		System.out.println("HashSet Elements are   : "+hset);
		String[] arr = new String[hset.size()];
		hset.toArray(arr);
		System.out.println("Array Elements are : ");
		for (int i = 0; i < hset.size(); i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
