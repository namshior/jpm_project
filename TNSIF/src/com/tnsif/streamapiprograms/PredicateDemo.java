package com.tnsif.streamapiprograms;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> pr=a->(a>18);  
		System.out.println(pr.test(78));  //creating predicate

	}

}
