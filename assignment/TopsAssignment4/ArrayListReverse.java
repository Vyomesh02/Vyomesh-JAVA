package com.TopsAssignment4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListReverse {

	public static void main(String[] args) {
		ArrayList<String> fruitArray =new ArrayList<>();
		fruitArray.add("Kiwi");
		fruitArray.add("Apple");
		fruitArray.add("Banana");
		fruitArray.add("Dragon Fruit");
		fruitArray.add("Mango");
		fruitArray.add("Pineapple");
		fruitArray.add("Cherry");
		
		System.out.println("Array list : "+fruitArray);
		Collections.reverse(fruitArray);
		System.out.println("ArrayList in Reverse Order : "+fruitArray);
		

     }

}
