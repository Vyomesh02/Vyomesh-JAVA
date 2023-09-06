package com.TopsAssignment;

public class StringStartEndsCheck {

	public static void main(String[] args) {
		String str1 = "Red is favorite color";
		String str2 = "Orange is also my favorite color";
		String str3 = "Red";
		
		System.out.println("Red is favorite color.Start with Red :"+str1.startsWith(str3));
		System.out.println("Orange is also favorite color.Start with Red :"+str2.startsWith(str3));

	}

}
