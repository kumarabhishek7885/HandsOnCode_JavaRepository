package myPackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		
		//Variable declaration
		int ans,result=0,a=0,b=0;
		
		//Taking user i/p for menu
		Scanner obj = new Scanner(System.in);
		boolean isValid = true;
		
		//Read the numbers from users
		System.out.println("Enter First No:");
		a =obj.nextInt();	
		System.out.println("Enter Second No:");
		b = obj.nextInt();
		
		//Creating Menu
		System.out.println("----CALCULATOR MENU----");
		System.out.println("1. ADDITION");
		System.out.println("2. SUBTRACTION");
		System.out.println("3. MULTIPLICATION");
		System.out.println("4. DIVISION");
		
		//Ask user choice
		System.out.println("Enter your choice:");
		ans = obj.nextInt();
				
		switch(ans) {
		case 1: 
			result = a+b;
			break;
		case 2:
			result = a-b;
			break;
		case 3:
			result = a*b;
			break;
		case 4:
			result = a/b;
			break;
			default:
				isValid = false;
			}
		
		if(isValid)//if true display result
		System.out.println("RESULT = " + result);
	
		else 
		//if false display invalid choice
		System.out.println("Invalid Input");				
	}
}
