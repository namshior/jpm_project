package com.tnsif.streamapiprograms;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class JavaStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> productlist=new ArrayList<Product>();
		productlist.add(new Product(1,"hp laptop",25000f));
		productlist.add(new Product(2,"dell laptop",35000f));
		productlist.add(new Product(3,"lenovo laptop",45000f));
		productlist.add(new Product(4,"apple laptop",65000f));
//		
//		List<Float> p2=productlist.stream().filter(p->p.price>30000)//filtering data
//				.map(p->p.price)//fetching price
//				.collect(Collectors.toList());//collecting as list
//		
//		System.out.println(p2);
//		
//		
//		double totalprice=productlist.stream().collect(Collectors.summingDouble(product->product.price));
//		
//		System.out.println(totalprice);

		//find maximum product list
		
		//find maximum product list
		
//		Product p=productlist.stream().max((p1,p2)->p1.price>p2.price?1:-1).get();
//		System.out.println(p.price);
		
		//find minimum product list
		Product p=productlist.stream().min((p1,p2)->p1.price>p2.price?1:-1).get();
		System.out.println(p.price);
		
		//count() method 
		
		long count=productlist.stream().filter(product->product.price<10000).count();
		
		System.out.println(count);
	}

}
