package myPackage;

public class MyClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj1 = new Employee();
		Employee obj2 = new Employee();
		
		obj1.readData();
		obj2.readData();
		
		obj1.printData();
		obj2.printData();
		System.out.println(Employee.company);
	}

}
