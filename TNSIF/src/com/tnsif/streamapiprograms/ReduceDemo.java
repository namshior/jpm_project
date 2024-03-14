package com.tnsif.streamapiprograms;
//to demonstrate reduce

import java.util.Arrays;
import java.util.List;

public class ReduceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number=Arrays.asList(1,2,3,4,5);
		//using reduce() to find the sum of the elements 
		
		int sum=number.stream().reduce(0, (a,b)->a+b);
		
		System.out.println("sum of the elemenets:"+sum);
	}

}
