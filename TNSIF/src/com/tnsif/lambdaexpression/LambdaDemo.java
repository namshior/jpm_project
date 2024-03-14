package com.tnsif.lambdaexpression;
//without parameter
public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Message m=()->{return "Hello";};
		System.out.println(m.greet());

	}

}
