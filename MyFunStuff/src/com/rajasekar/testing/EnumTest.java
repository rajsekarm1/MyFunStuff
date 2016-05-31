package com.rajasekar.testing;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

enum Testing{
	Test1,
	Test2
}

public class EnumTest {
	
	

	public static void main(String[] args) {
		Map<Testing,String> enumMap = new EnumMap<>(Testing.class);
		enumMap.put(Testing.Test1,"test1");
		enumMap.put(Testing.Test2,"test2");
		System.out.println(enumMap);
		
		if(Testing.Test1==Testing.Test1)
			System.out.println(true);
		
		
		List<String> list = new ArrayList<String>();
		list.add(0,"tets1");
		list.add(0,"tets2");
		System.out.println(list);
	}

}
