package myPackage;

public abstract class Salary{
	
	public int PF(int basic) {
		return 12*basic/100;
		
	}
	
	public int HRA(int basic) {
		return 40*basic/100;
	}
	
	public abstract int SA();
	
	public abstract int TA();
}

class IBM extends Salary{

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