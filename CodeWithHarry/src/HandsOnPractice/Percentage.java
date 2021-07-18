package HandsOnPractice;
import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		
System.out.println("Enter the marks of subjects:");

Scanner sc = new Scanner(System.in);

System.out.println("Enter marks of Maths:-");
float m1 = sc.nextFloat();

System.out.println("Enter marks of English:-");
float m2 = sc.nextFloat();

System.out.println("Enter marks of Science:-");
float m3 = sc.nextFloat();

System.out.println("Enter marks of Hindi:-");
float m4 = sc.nextFloat();

float percentage = (m1+m2+m3+m4)/40;

System.out.println("%age are : "+ percentage);
	}

}
