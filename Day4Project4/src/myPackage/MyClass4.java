package myPackage;

import java.util.HashMap;

public class MyClass4 {

	public static void main(String[] args) {
		
				HashMap<Integer,String> data = new HashMap<Integer,String>();
				
				data.put(1, "Abhishek");
				data.put(2, "Kumar");
				data.put(3, "Ayaan");
				data.put(4, "Priyanka");
				
				System.out.println(data.get(1));
				System.out.println(data.get(2));
				System.out.println(data.get(3));
				System.out.println(data.get(4));
	}

}
