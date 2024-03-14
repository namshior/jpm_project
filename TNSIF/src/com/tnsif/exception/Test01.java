package com.tnsif.exception;

public class Test01 {

	public static void main(String[] args) {
		try {
			System.out.println(100/0);
		}
		catch(NullPointerException e) {
			System.out.println("exception caught"+e.getMessage());
		}
		finally {
			System.out.println("end");
		}
	}

}
