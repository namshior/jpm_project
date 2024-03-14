package com.tnsif.stringdemo;

public class StringBuferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer b=new StringBuffer("hello");
		//b.append(" Welcome to java");	//original object changed
		//System.out.println(b);
		
//		b.insert(2, "hi");
//		System.out.println(b);
//		
//		b.replace(1, 3, "word");
//		System.out.println(b);
		
//		b.delete(0,3);
//		System.out.println(b);
		
		b.reverse();
		System.out.println(b);
		
	}

}
