package com.eci;

enum  System{
	NMS, EMS, EMB;
}

public class UseCase {
	
	public UseCase(String opertionName, System... system){
		
	}
	
	
	public static void main(String args[]){
		UseCase case = new UseCase("CreateTrail",System.NMS,System.EMS,System.EMB);
	}
	

}
