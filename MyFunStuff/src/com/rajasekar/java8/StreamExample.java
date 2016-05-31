package com.rajasekar.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		String appendString ="";
		List <String>units = new ArrayList<>();
		units.add("slot-u1");
		units.add("slot-u2");
		
		List<String> testString = units.stream()
		.filter((unit)->{
			System.out.println("Inside filte rmethod");
			if(unit.equals("slot-u1")){
				return false;
			}else{
				return false;
			}				
		})
		.collect(Collectors.toList());
		
		System.out.println( testString);

	}

}
