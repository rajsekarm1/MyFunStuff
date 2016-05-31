package com.rajasekar.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/* This class show the examples of the following
 * --> Internal Iterator
 * --> Lamda Expression
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

interface IFunctionalInterface2{
	public void method2(String str);
}


public class LambdaExample1 {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		
		Stream.
		String str = "slot-u1".substring(5);
		System.out.println(str);
		
		List<String> list = new ArrayList<String>();
		list.add(new String("raj"));
		list.add(new String("raj3"));
		list.add(new String("raj2"));
		
		
		
		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String arg0) {
				System.out.println(arg0);
				
			}
		});
		final int i;
		list.forEach((String arg0) -> { 
										int j=0;
										
										System.out.println(arg0);
		
		});
		
		list.forEach(arg0 -> System.out.println(arg0));
		
		list.forEach(System.out::println);
		
		list.sort((a,b) -> b.compareTo(a));
		
		IFunctionalInterface testWithAnnotatin = () -> System.out.println("test");
			
		
		testWithAnnotatin.methodOne();
		
		IFunctionalInterface2 interface2 = System.out::println;
		interface2.method2("testing");

	}
	
}
