package com.tnsif.streamapiprograms;

import java.util.stream.Stream;

public class SkipExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream.of(1,2,3,4,5,6,7,8,9)
		.filter(num->num%2==0)// filter even number
//		.skip(2)//skip first 2 numbers
		
		.limit(6) //it will give only one element
		.forEach(num->System.out.println(num+" "));

	}
	

}
