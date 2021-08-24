package myPackage;

public class Mathematics {

	public final float PI = 3.14f;
	
	class Algebra
	{
		public int add(int a, int b) 
		{
			return a+b;
		}
	}
	
	class Geometry
	{
		public float circleArea(int r)
		{
			return PI*r*r;
		}
		public float circlePerimeter(int r)
		{
			return 2*PI*r;
			
		}
	}
}
