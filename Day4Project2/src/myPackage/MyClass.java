package myPackage;

import java.util.ArrayList;

public class MyClass {

	public static void main(String[] args) {
		
		//ArrayList is a part of java.util package
		//Creating an ArrayList
		ArrayList<Integer> data = new ArrayList<Integer>();
		
		//Adding elements to ArrayList
		data.add(50);
		data.add(30);
		data.add(40);
		data.add(70);
		data.add(90);
		
		//find sum of elements in ArrayList
		int sum=0;
		for (var d:data)
			sum+=d;
		System.out.println("sum are :"+sum);
	}

}
