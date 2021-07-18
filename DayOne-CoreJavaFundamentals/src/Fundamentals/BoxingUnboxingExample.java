package Fundamentals;

public class BoxingUnboxingExample {
	
public static void main(String args[]) {
	/* Boxing:- converting primitive into object
	int a = 100;//this is primitive
	
	Integer intObj = Integer.valueOf(a);//here converting primitive into object
	
	System.out.println(a);
	System.out.println(intObj);
	*/
	
	// UnBoxing:- converting object into primitive
	Integer intObj = new Integer(100);
	int a = intObj.intValue();
	System.out.println(intObj);
	System.out.println(a);
	
	
}
}
