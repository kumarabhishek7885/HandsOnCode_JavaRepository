package myPackage;

/*1. An abstract class can have a normal method
 * 2. An abstract class can have abstract methods
 * 3. An normal class can not have abstract methods 
 * 
 * Two uses of abstract classes are:
 * 1. Re-usability
 * 2. Enforce derived class to implement abstract methods
 * 3. Its a Template
 * */

public abstract class Salary{
	
	public int PF(int basic) {return 12*basic/100;}
	
	public int HRA(int basic) {return 40*basic/100;}
	
	public abstract int SA();
	
	public abstract int TA();
	
}

//MicroSoft class inheriting class Salary
class MicroSoft extends Salary{
	
	//In derived class we are implementing abstract methods() which are declared abstract in base class
	public int SA() {
	return 3000;	
	}
	
	public int TA() {
	return 2500;
	}
}

	class InfoSys{
		
	public int PF(int basic) {
		return 12*basic/100;
		
	}
	
	public int HRA(int basic) {
		return 40*basic/100;
	}
	
	public int SA() {
		return 1000;
		
	}
	
	public int TA() {
		return 200;
	}
}
	
	class Cognizants{
		
		public int PF(int basic) {
			return 12*basic/100;
			
		}
		
		public int HRA(int basic) {
			return 40*basic/100;
		}
		
		public int SA() {
			return 1000;
			
		}
		
		public int TA() {
			return 200;
		}
	}