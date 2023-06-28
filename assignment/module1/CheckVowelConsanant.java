package com.TopsAssignment;

import java.util.Scanner;

public class CheckVowelConsanant {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A any Character : ");
		String st = sc.next();
		char c = st.charAt(0);
		
		if(st.length()>1) {
			System.out.println("Error...length is More Than one Character");
		}
		else if(c=='a' || c=='A'||c=='e' || c=='E'||c=='i' || c=='I'||c=='o' || c=='O'||c=='u' || c=='U') {
			System.out.println("Enter character is Consonant......");
		}
		else {
			System.out.println("Entered Character is Vowel.....");
		}
		
		
	}

}
