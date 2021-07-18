package models;

public class Sports extends Marks {
	
	protected float score;
	
	public void acceptDetails() {
		 
		 super.acceptDetails();
		 
		 System.out.println("Enter score : ");
		 this.score = scan.nextFloat();
		}
	 
	 public void displayDetails() {
		 
		 super.displayDetails();
		 System.out.println("score obtained : " + this.score);
	
	 }

}
