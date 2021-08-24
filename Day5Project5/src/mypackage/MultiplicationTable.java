package mypackage;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
	int n;
	Scanner obj = new Scanner(System.in);
	
	System.out.println("Enter any number:");
	n=obj.nextInt();
	
	for(int i=1;i<=10;i++)
	{
		System.out.println(n+"X"+i+"="+n*i);
		System.out.println("\n");
	}
	obj.next();
	}

}
