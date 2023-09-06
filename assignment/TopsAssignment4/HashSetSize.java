package com.TopsAssignment4;

import java.util.HashSet;

public class HashSetSize {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("AAA");
		hs.add("BBB");
		hs.add("CCC");
		hs.add("CCC");
		hs.add("DDD");
		hs.add("EEE");
		System.out.print("HashSet  : ");
		System.out.println(hs);
	    int noOfElements = hs.size();
	    System.out.print("Size of HashSet : "+noOfElements);
		
		
	}

}
