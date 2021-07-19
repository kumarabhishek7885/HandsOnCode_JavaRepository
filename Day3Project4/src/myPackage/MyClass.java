package myPackage;
/*Interface:
* ---------------
* An interface is a pure abstract class
* It has all methods abstract
* interface is called a contract
*/

interface Shape{
	
	//here area() & periMeter() are abstract methods
	 int area();//we need not explicitly write abstract keyword it is automatically abstract method 
	 int periMeter(); //as it is interface
}

class circle implements Shape{

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int periMeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	}
	
public class MyClass {

}
