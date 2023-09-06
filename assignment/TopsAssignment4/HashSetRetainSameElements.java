package com.TopsAssignment4;

import java.util.HashSet;

public class HashSetRetainSameElements {

	public static void main(String[] args) {
		HashSet hset1 = new HashSet();
		hset1.add("Apple");
		hset1.add("Banana");
		hset1.add("Blackberry");
		hset1.add("Pineapple");
		hset1.add("Cherry");
		System.out.println("First Hashset Elements         : "+hset1);
		
		HashSet hset2 = new HashSet();
		hset2.add("Watermalen");
		hset2.add("Kiwi");
		hset2.add("Mango");
		hset2.add("Pineapple");
		hset2.add("Blackberry");
		System.out.println("Second Hashset Elements        : "+hset2);

		hset1.retainAll(hset2);
		System.out.println("Same HashSet Elements on Both  : "+hset1);
	}

}
