package com.rajasekar.generics;

public class Chapter4 {
	
	public static void main(String args[]){
		String[] strings = new String[10];

		// cast it to an array of objects
		Object[] objects = strings;

		// insert an object into the array
		objects[0] = new Object();
		
		
		Pair<String,String> pair = new Pair<String,String>("raja", "rani");
		String str = pair.getFirstArg();
		System.out.println(str);
	}

}

class Pair<T,U>{
	private T arg1;
	private U arg2;
	public Pair(T arg1, U arg2){
		this.arg1=arg1;
		this.arg2=arg2;
	}
	
	public T getFirstArg(){
		return arg1;
	}
	
	public U getSecondArg(){
		return arg2;
	}
}
