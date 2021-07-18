package models;

public class Results extends Sports {

	float totalmarks;
	float averagemarks;
	
	public void calculate() {
		this.totalmarks = this.objectivemarks + this.subjectivemarks + this.score;
		this.averagemarks = this.totalmarks/3;
		
		System.out.println("TotalMarks : " + this.totalmarks);
		System.out.println("Average Marks : " + this.averagemarks);
		
		if(this.objectivemarks >70 && this.subjectivemarks >70 && this.score > 70) {
			if(this.averagemarks >=75) {
				System.out.println("you are selected for nexr round.");
			}else {System.out.println("you are Rejected.");}
			
		}
		else {
			System.out.println("you are Rejected. try again");
			
		}
		
	}
}
