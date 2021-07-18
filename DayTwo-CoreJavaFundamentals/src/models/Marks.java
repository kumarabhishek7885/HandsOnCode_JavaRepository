package models;

public class Marks extends Student {
	
		protected float objectivemarks;
		protected float subjectivemarks;
		
		public void acceptDetails() {
			 
			 super.acceptDetails();
			 
			 System.out.println("Enter objectivemarks: ");
			 this.objectivemarks = scan.nextFloat();
			 
			 System.out.println("Enter subjectivemarks: ");
			 this.subjectivemarks = scan.nextFloat();
			 					 
			}
		 
		 public void displayDetails() {
			 
			 super.displayDetails();
			 System.out.println("objective marks : " + this.objectivemarks);
			 System.out.println("subjective marks : " + this.subjectivemarks);
		
		 }
		
		

}
