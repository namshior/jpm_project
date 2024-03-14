package com.tnsif.exception;

import java.io.IOException;

public class Test2 {

	public static void main(String[] args) {
		Throwdemo t=new Throwdemo();
		try {
			t.display();
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}
