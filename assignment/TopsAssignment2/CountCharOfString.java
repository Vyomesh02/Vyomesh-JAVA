package com.TopsAssignment2;

import java.util.Scanner;

public class CountCharOfString {

	public static void main(String[] args) {
		int ltr = 0, space = 0, num = 0;
		System.out.print("Enter a any String :");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(ch[i])) {
				ltr++;
			}
			if (Character.isSpace(ch[i])) {
				space++;
			}
			if (Character.isDigit(ch[i])) {
				num++;
			}

		}
		System.out.println("No of character in string   : " + str.length());
		System.out.println("No of Letter in String is    : " + ltr);
		System.out.println("No of Space in String is    : " + space);
		System.out.println("No of Digit in String is    : " + num);

	}

}
