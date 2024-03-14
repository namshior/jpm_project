package com.tnsif.exception;

public class Nestedtryblock {
//to demonstrate nested try block
	
	public static void check() {
		String str="TNS";
		int slength=str.length();
		System.out.println("length of the string"+slength);
		
		String anotherstring=null;    //data member
		int y=6;
		
		try {
			try {
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println("index out of bound"+e.getMessage());
			}
			System.out.println("string length"+anotherstring.length());
		}
		catch(NullPointerException e) {
			System.out.println("exception is thrown"+e.getMessage());
		}

	}

}
