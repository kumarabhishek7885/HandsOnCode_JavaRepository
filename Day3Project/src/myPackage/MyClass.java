package myPackage;

import java.util.Scanner;

public class MyClass {

	static int factorial(int n) {
		int i,fact1 = 1;
		
		for(i=1;i<=n;i++)
		fact1 = fact1 * i;
		return fact1;
	}
	
	public static void main(String[] args) {
		
		/*
		 * //variable declaration
		
		String name;
		int age;
		float height;
		Scanner obj = new Scanner(System.in);
		
		//Read data from user
		System.out.println("Enter your name");
		name = obj.nextLine();
		
		System.out.println("Enter your age");
		age = obj.nextInt();
		
		System.out.println("Enter your height");
		height = obj.nextFloat();
		
		System.out.println("your name is : " + name);
		System.out.println("your age is :" + age);
		System.out.println("Your height is :" + height);
		*/
		
		//factorial
//		int i,n1=4,fact1 =1,n2=5,fact2=1;
//		
//		for(i=1;i<=n1;i++)
//			fact1 = fact1 * i;
//		
//		for(i=1;i<=n2;i++)
//			fact2 = fact2 * i;
//		
//		System.out.println(fact1);
//		System.out.println(fact2);
//		
//				
//		System.out.println(factorial(4));
//		System.out.println(factorial(5));
//		System.out.println(factorial(8));
		/*
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number to find factorial");
		int num = obj.nextInt();
		System.out.println(factorial(num));
		*/
	}

}
