package HandsOnPractice;

class base{
	public int x;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		System.out.println("I am in a base and setting x now");
		this.x = x;
	}

	public void printMe() {
		
		System.out.println("I am a Constructor");
	}
}

class child extends base{
public int y;

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}

}

public class InheritanceDemo {

	public static void main(String[] args) {
		
		//object of base now
		base obj =new base();
		obj.setX(4);
		System.out.println(obj.getX());
		
		//Note: object of base class can't access the member or method of child class
		//obj.setY();
		//System.out.println(obj1.getY());
		
		//object of child now
		child obj1 =new child();
		obj1.setX(43);
		System.out.println(obj1.getX());	
	}
}
