package com.TopsAssignment3;

public class Exception_MultipleCatch {

	public static void main(String[] args) {
		
		try {
			int[] arr =new int [5];
			arr[5]=30/0;
			System.out.println(arr[10]);
		} catch (IndexOutOfBoundsException e) {
		    System.out.println(e);
		    e.printStackTrace();
		}catch (ArithmeticException e1) {
			e1.printStackTrace();
			System.out.println(e1);
		}
		
		}
	}


