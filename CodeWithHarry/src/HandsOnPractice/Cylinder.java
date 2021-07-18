package HandsOnPractice;

class Cylinder1{
	
	private int radius;
	private int height;
	
	//constructor
	public Cylinder1(int radius, int height) {
		super();
		this.radius = radius;
		this.height = height;
	}
	//getter and setter
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double surFaceArea() {
		return 2 * Math.PI * radius * radius + 2* Math.PI * radius * height ;//we can use value of pi = 3.142 as well
		
	}
	public double volume() {
		return Math.PI * radius * radius * height ;
		
	}
}

public class Cylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cylinder1 obj = new Cylinder1(9,12);
		
		//obj.setHeight(12); //using setter to set value
		int h = obj.getHeight();//using getter to get value
		System.out.println(h);
		
		//obj.setRadius(9);
		System.out.println(obj.getRadius());
		
		System.out.println(obj.surFaceArea());
		
		System.out.println(obj.volume());
		
	}
}

