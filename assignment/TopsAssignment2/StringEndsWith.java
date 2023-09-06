//W.A.J.P to check whether a given string ends with the contents of another string. 
//"Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True


package com.TopsAssignment2;

public class StringEndsWith {

	public static void main(String[] args) {
		String str1  = "Java Exercises";
		String str2  = "Java Exercise";
		
		System.out.println(str1+" Ends with 'ses'  : "+str1.endsWith("se"));
		System.out.println(str2+" Ends with 'se'  : "+str2.endsWith("se"));
		
	}

}
