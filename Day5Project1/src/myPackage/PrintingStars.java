package myPackage;

public class PrintingStars {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) 
		{
			for(int j=1;j<=3;j++)
			{
			System.out.print(" * ");
			}//inner for
			System.out.println("\n");
		}//outer for
		
		//Printing Pyramid
		for(int i=1;i<=6;i++) 
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(" * ");
			}//inner for
			System.out.println("\n");
		}//outer for
	}
}
