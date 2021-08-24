package myPackage;

public class MyClass {

	public static void main(String[] args) {
		
		//Object for Mathematics - Outer Class
		Mathematics m = new Mathematics();
		
		//Object for Geometry - Inner Class
		Mathematics.Geometry g = m.new Geometry();
		
		//Object for Algebra - Inner Class
		Mathematics.Algebra al = m.new Algebra();
		
		System.out.println(g.circleArea(7));
		System.out.println(al.add(3, 4));
		
		
	}

}
