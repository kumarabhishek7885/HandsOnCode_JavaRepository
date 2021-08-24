package myPackage;

public class Array {

	public static void main(String[] args) {
		
		//int[][] matrix = new int[3][2];
		
		//1-D array
		int[] data = new int[] {4,5,6,7,9};
		
		//2-D array
		int[][] matrix = new int[][] {{1,2},{3,4},{7,9}};
		
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j]+" "); // printing matrix 
			}		
			System.out.println("\n");
	
		}
		
	}

}
