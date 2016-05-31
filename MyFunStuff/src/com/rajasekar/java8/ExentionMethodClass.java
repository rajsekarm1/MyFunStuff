package com.rajasekar.java8;

interface ExentionMethodInterface {
	
	public void method1();
	
	default public void method2(){
		System.out.println("Method 2 of interface");
	}

}

public class ExentionMethodClass{
	
	public static void main(String args[]){
		ExentionMethodInterface anonyms = new ExentionMethodInterface() {
			
			@Override
			public void method1() {
				System.out.println("method1");
				
			}
		};
		anonyms.method1();
		anonyms.method2();
	}
	

	
}
