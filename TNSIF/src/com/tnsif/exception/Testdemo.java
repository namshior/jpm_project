package com.tnsif.exception;
//to demonstrate throw keyword
import java.util.Scanner;

public class Testdemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the roll number:");
	int rollno=sc.nextInt();
	if(rollno<0) {
		throw new ArithmeticException("roll number cannot be negative");
	}
	else {
		System.out.println("valid roll number");
	}
}
}
