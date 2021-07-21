package myPackage;

import java.util.Scanner;

public class MyClass 
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee("Abhishek",30000,32);
		
		//emp.readData();
		emp.printData();
	}
}
class Employee
{
	private String name;
	private int salary;
	private int age;

	
public Employee(String name, int salary, int age) {
		
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

public void readData()
{
	Scanner obj = new Scanner(System.in);
	
	//reading inputs from user
	System.out.println("Enter Name: ");
	name =obj.nextLine();
	
	System.out.println("Enter Salary: ");
	salary = obj.nextInt();
	
	System.out.println("Enter Age: ");
	age = obj.nextInt();
	obj.close();
}

public void printData() 
{
	System.out.println("Name = "+name);
	System.out.println("Age = "+age);
	System.out.println("Salary = "+salary);
}

}
