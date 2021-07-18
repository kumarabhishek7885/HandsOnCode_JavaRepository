package HandsOnPractice;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
	System.out.println("Taking Input from user");
	
	Scanner obj = new Scanner(System.in);
	
	System.out.println("Enter First No");
	int a = obj.nextInt();
	System.out.println("Enter Second No");
	int b = obj.nextInt();
	
	int sum = a+b;
	System.out.println("The sum of these two no are :");
	System.out.println(sum);

	}

}
