package models;
import java.util.Scanner;

 public class Student {

	 private int id;
	 private String name;
	 
	 Scanner scan = new Scanner(System.in);
	 
	 public void acceptDetails() {
		 
		 System.out.println("Enter ID: ");
		 this.id = scan.nextInt();
		 
		 scan.nextLine();
		 
		 System.out.println("Enter name: ");
		 this.name = scan.nextLine();
	 }
	 
	 public void displayDetails() {
		 
	System.out.println("Student Id : " + this.id);
	System.out.println("Student Name : " + this.name);
	
	 }
}
