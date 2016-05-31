package com.rajasekar.java8;

import java.util.Optional;

public class OptionalMainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.setB(null);
		System.out.println(Optional.of(a).flatMap(A::getB));
		

	}
	
	

}
class A{
	
	private B b;

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
}

class B{
	private Integer intValue;

	public Integer getIntValue() {
		return intValue;
	}

	public void setIntValue(Integer intValue) {
		this.intValue = intValue;
	}
}
