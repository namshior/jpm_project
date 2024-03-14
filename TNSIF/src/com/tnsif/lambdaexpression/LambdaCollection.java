package com.tnsif.lambdaexpression;

import java.util.ArrayList;
public class LambdaCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> li=new ArrayList<Integer> ();
		li.add(22);
		li.add(2);
		li.add(8);
		li.add(5);
		
//		//for each loop
//		
//		for(Integer ele:li) {
//			System.out.println(ele);
//		}
		
		li.forEach(element-> System.out.println(element));
	}

}

