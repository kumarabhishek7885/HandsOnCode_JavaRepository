package myPackage;

public class MyClass {

	public static void main(String[] args) {
		int[] data = new int[8];
		
		//There are 4 ways to print array elements
		for(int i=0;i<5;i++)
			System.out.println(data[i]);
		
		for(int i=0;i<data.length;i++)
			System.out.println(data[i]);
		
		for(int d:data)
			System.out.println(d);
		
		for(var d:data)
			System.out.println(d);

	}

}
