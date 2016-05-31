package com.rajasekar.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example1 <T>{

	T[]  t =null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Number> listNum = new ArrayList<Number>();
		
			
		//listNum = new ArrayList<Integer>();
		//Not Valid value
		Integer i[] = null;
		
		List<Integer> intList = Example1.converToList(i);
		Example1.convertToListVarargs(1,2,3);
		
		
		
	}
	
	public static void testing(List<? extends Number> listNum){
		listNum.get(3);
	}
	
	//Generics in Method not defined in Class
	
	public static <T> List<T> converToList(T[] array){
		List<T> list = new ArrayList<T>();
		
		list.addAll(Arrays.asList(array));
		return list;
	}
	
	public static <T> List<T> convertToListVarargs(T... vararg){
		List<T> list = new ArrayList<T>();
		
		list.addAll(Arrays.asList(vararg));
		return list;
	}

}
