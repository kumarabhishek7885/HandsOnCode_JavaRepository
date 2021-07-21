package myPackage;

import java.util.TreeSet;

public class MyClass3 {

	public static void main(String[] args) {
				
		// In TreeSet elements will be displayed in sorted order (ascending)
		TreeSet<Integer> data = new TreeSet<Integer>();
		data.add(10);
		data.add(20);
		data.add(30);
		data.add(30);//It also won't show duplicate element in set
		data.add(50);
		//set won't store a duplicate value
		System.out.println(data.size());//Printing size of TreeSet and size will be 4 and not 5 because 30 is duplicate element

		for(int d:data)
			System.out.println(d); //printing elements of set duplicate element will be ignored
	}

}
