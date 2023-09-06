package com.TopsAssignment4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<String> fruitArray =new ArrayList<>();
		fruitArray.add("Kiwi");
		fruitArray.add("Apple");
		fruitArray.add("Banana");
		fruitArray.add("Dragon Fruit");
		fruitArray.add("Mango");
		fruitArray.add("Pineapple");
		fruitArray.add("Cherry");
		
		System.out.print("Array List Before sorting : ");
		System.out.println(fruitArray);
		Collections.sort(fruitArray);
		System.out.print("Array List After sorting : ");
		System.out.println(fruitArray);
		

     }

}
