package com.TopsAssignment4;

import java.util.HashMap;

public class HashMapEmpty {

	public static void main(String[] args) {
		HashMap hmap = new HashMap();
		hmap.put(1, "AAA");
		hmap.put(2, "BBB");
		hmap.put(3, "CCC");
		
		System.out.print("HashMap Elements are : "+hmap);
		boolean b = hmap.isEmpty();
		System.out.println();
		System.out.println("HashMap is empty : "+b);
	}

}
