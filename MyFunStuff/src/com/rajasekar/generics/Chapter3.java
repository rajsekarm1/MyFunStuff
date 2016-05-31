package com.rajasekar.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Chapter3 {

	public static void main(String[] args) {
		Integer i = new Integer(12);
		Integer f = new Integer(12);
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(i);
		numList.add(f);
		//System.out.println(max(numList));
		
		 //List of apples
	      List<Apple> apples = new ArrayList<Apple>();
	      apples.add(new Apple());
	       
	      //We can assign a list of apples to a basket of fruits;
	      //because apple is subtype of fruit 
	      List<? extends Fruit> basket = apples;
	       
	      //Here we know that in basket there is nothing but fruit only
	      for (Fruit fruit : basket)
	      {
	         System.out.println(fruit);
	      }
	       
	      basket.add(new Apple()); //Compile time error
	      basket.add(new Fruit()); //Compile time error
	}
	
	/*public static <T> T max(Collection <T extends Collection> coll) {
	   
	    T candidate = coll.iterator().next();
	    for (T elt : coll) {
	        if (candidate.compareTo(elt) < 0) candidate = elt;
	    }
	    return candidate;
	}*/
	
	public static  void  max(List <? extends Number> list){
		int i=0;
		
		Number obj = (Number)list.get(i);
	}
	
}


