package myPackage;

import java.util.Scanner;

public class ArrayClass {

	public static void main(String[] args) {
		
		int[] data = new int[5];
		int sum=0,avg,i;
		Scanner obj = new Scanner(System.in);
		
		//Read no from user in array
		for(i=0;i<data.length;i++) {
			System.out.println("Enter number in array:-");
			data[i]=obj.nextInt();
		}
		
		//find sum of no
		for(var d:data)
			sum+=d;
		
		//find an average
		avg = sum/data.length;
		
		System.out.println("Sum="+sum);
		System.out.println("Average="+avg);
		
	}
		
}
