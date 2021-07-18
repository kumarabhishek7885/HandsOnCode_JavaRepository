package MyPackage;

public class A2 {
	  
		  static{
			  System.out.println("static block is invoked before main method()");
			  }  
		  
		  public static void main(String args[]){  
			  
		   System.out.println("Hello main method executed after static block");  
		  }  
		} 
