//Java Program to demonstrate why we need method overriding  
//Here, we are calling the method of parent class with child  
//class object. 


class Vehicle{  //Creating a parent class 
	
  void run(){
	  System.out.println(" Parent Vehicle is running");
	  }  
}  

//Creating a child class  
class Bike extends Vehicle{  
	
  public static void main(String args[]){  
	  
  //creating an instance of child class  
  Bike obj = new Bike();  
  
  //calling the method with child class instance  
  obj.run();  
  }  
}  