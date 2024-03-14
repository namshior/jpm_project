package com.tnsif.exception;

import java.io.IOException;

//to demonstrate throws keyword
public class Throwdemo {
	
	static void display() throws IOException {
		throw new IOException();
	}

}
