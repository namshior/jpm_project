package com.tnsif.lambdaexpression;
//parameter demo
public class ParameterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cube c=(a)->{return a*a*a;};
		System.out.println("cube of the number is :"+c.calculate(2));
		
		Square s=(x)->{return x*x;};
		System.out.println("square of the number is :"+s.calculate(5));
		
		}

	}


