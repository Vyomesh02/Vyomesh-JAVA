package com.TopsAssignment2;

public class StringInterleaving {

	public static void main(String[] args) {
		
		String str = "WXYZ";
		char[] ch = str.toCharArray();
	//	for (int i = 0; i < ch.length; i++) {
	//		System.out.print(" "+ch[i]);
	//	}
		
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
			for (int j =1; j < 2; j++) {
				System.out.print(ch[j]);
				for (int k = 2; k < 3; k++) {
					System.out.print(ch[k]);
					for (int l =3; l < 4; l++) {
						System.out.print(ch[l]);
						System.out.println();
						
						
					}
				}
			}
		}
		
	}

}
