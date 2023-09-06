//Que- print numbers between 1 to 100 which are divisible by 3, 5 and by both.
package com.TopsAssignment2;

public class NoDivisibleBy3and5 {

	public static void main(String[] args) {
		System.out.println("Number Divisible by 3 between 1 to 100...");
		for (int i = 1; i < 100; i++) {
			
			if(i%3==0) {
			
			System.out.print(i+", ");
			}}
		System.out.println();
		System.out.println("Number Divisible by 5 between 1 to 100...");

		for (int j = 1; j < 100; j++) {
		    if(j%5==0) {
			System.out.print(j+", ");
			}}
		System.out.println();
		System.out.println("Number Divisible by Both 3 & 5 in between 1 to 100...");

		for (int k = 1; k < 100; k++) {
         	if(k%5==0 && k%3==0) {
			System.out.print(k+", ");
			}}
		}
	}


