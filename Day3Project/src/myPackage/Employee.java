package myPackage;

import java.util.Scanner;

public class Employee {

	private String name;
	private int age;
	static public String company = "IBM";
	
	public void readData() {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter name: ");	
		name = obj.nextLine();
		System.out.println("Enter age:");
		age = obj.nextInt();	
	}
	
	public void printData() {
		
		System.out.println("Name is : " +name);
		System.out.println("Age is : " +age);
		//System.out.println("Company is : " +company);
		
	}
}

