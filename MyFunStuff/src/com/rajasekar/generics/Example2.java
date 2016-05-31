package com.rajasekar.generics;

import java.util.ArrayList;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		List<Banana> bananaList = new ArrayList<>();
		List<? extends Fruit> fruitList = bananaList;
		T t = fruitList.get(0);
	}

}

interface A<T>{
	
}
class B<T> implements A<T>{
	
}


class Fruit{
	
	public void displayFruit(){
		
	}
	
}
class Banana extends Fruit{
	
}
class JackFruit extends Fruit{
	
}