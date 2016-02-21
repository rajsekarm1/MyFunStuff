package com.rajasekar.java7;

public class CatchSimilarException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			throw new NullPointerException();
		}catch(NullPointerException | ArrayIndexOutOfBoundsException exec){
			System.out.println("Entered to catch Block");
		}
	}

}
