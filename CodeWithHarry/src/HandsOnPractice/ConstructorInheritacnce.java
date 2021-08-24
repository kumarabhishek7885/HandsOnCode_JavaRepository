package HandsOnPractice;

class Base
{
	Base()
	{
		System.out.println("I am Constructor of Base Class");
	}
}

class Derived extends Base
{
		public Derived() {
			System.out.println("I am Constructor of Derived Class");
		}
}

public class ConstructorInheritacnce {

	public static void main(String[] args) 
	{
		//Base b = new Base();
		Derived d = new Derived(); // here also base class constructor will be called even derived has no constructor in class
		//Note - if derived has constructor then derived class constructor will be called 
		//first base class constructor will be called then derived one if present

	}

}
