package com.rajasekar.java8;

import java.awt.Color;
import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import java.util.stream.Stream;

@FunctionalInterface
interface Testing{
	public void test();
	public static void testingMethod(){
		System.out.println("testing");
	}
	
	public default void testingDefaultMethod(){
		System.out.println("Default Method");
		Stream.of("true","false").filter(Boolean::getBoolean);
	}
}


public class StandardFunctionalInt {

	public static void main(String[] args) {
		Stream<String> s =null;
		s.map(Class::forName);
		Testing.testingMethod();
		testBooleanSupplier(Boolean::getBoolean);

	}
	
	
	public static void testBooleanSupplier(Predicate<String> predicate){
		System.out.println(predicate.test("true"));
	}

}
