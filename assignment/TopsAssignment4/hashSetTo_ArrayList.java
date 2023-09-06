package com.TopsAssignment4;

import java.util.ArrayList;
import java.util.HashSet;

public class hashSetTo_ArrayList {

	public static void main(String[] args) {
		HashSet hset = new HashSet();
		hset.add("A");
		hset.add("B");
		hset.add("C");
		hset.add("D");
		hset.add("E");
		
		System.out.println("HashSet Elements are   : "+hset);
		
		ArrayList list = new ArrayList(hset);
		System.out.println("ArrayList Elements are : "+list);
		
	}

}
