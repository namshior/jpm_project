package com.tnsif.stringdemo;

public class TestImmutable {
	public static void main(String[] args) {
		String s="          sachin";
		System.out.println(s);
//		s=s.concat(" tendulkar");
//		System.out.println(s);
		System.out.println(s.length()); //length
		System.out.println(s.charAt(3));
		
		System.out.println(s.replace("a", "welcome"));
		
		System.out.println(s.toUpperCase());
		
		System.out.println(s.trim());
	}

}
