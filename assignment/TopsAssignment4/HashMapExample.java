package com.TopsAssignment4;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Dhoni");
		hm.put(2, "Sachin");
		hm.put(3, "Sehwag");
		hm.put(4, "Yuvraj");
		hm.put(5, "Zahir Khan");
		System.out.println("HashMap Elements : "+hm);
		
		int size =hm.size();
		System.out.println("Size of HashMap : "+size);
	}

}
