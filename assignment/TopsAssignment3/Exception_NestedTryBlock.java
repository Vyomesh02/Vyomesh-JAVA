package com.TopsAssignment3;

public class Exception_NestedTryBlock {

	public static void main(String[] args) {

		
		try {
			try {
				int b=30/0;
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			int[] a= new int[5];
			System.out.println(a[5]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
