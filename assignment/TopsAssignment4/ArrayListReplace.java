package com.TopsAssignment4;

import java.util.ArrayList;

public class ArrayListReplace {

	public static void main(String[] args) {

			ArrayList a= new ArrayList();
			a.add("Red");
			a.add("Green");
			a.add("yellow");
			a.add("Pink");
			
			System.out.println("ArrayList Elements : "+a);
			//replace yellow with blue
			a.set(1, "Blue");
			System.out.println("ArrayLis after Replace(2nd elements : "+a);
	}

}
