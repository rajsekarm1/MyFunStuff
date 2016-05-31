package com.rajasekar.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

enum Days{
	Monday, Tunesday
}
public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Number> numberCol = new ArrayList<Number>();
		Collections.addAll(numberCol, new Integer(10));
		testingmethod(new Float(10.0), new Integer(10));
		List<Number> listNum = new ArrayList<>();
		listNum.add(new Integer(34));
		EnumSet<Days> enumSet = new EnumSet<Days>();
	}

	
	public static <T> void testingmethod(T arg1, T arg2) {
		Float f = (Float)arg2;
		
	}
	
}
