package com.rajasekar.java7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileAutoClose {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		try (FileInputStream in = new FileInputStream("java7.txt")) {
			System.out.println(in.read());
		}
		

	}

}
