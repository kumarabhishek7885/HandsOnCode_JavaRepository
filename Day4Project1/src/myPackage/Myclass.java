package myPackage;

public class Myclass {

	public static void main(String[] args) {
			
				int i;
				int[] data = new int[]{4,7,8,2,9};
				//int[] data1 = new int[5];this is also way to declare an array
				
				String[] names = new String[] {"infosys","Cognizant","Accenture"};
				
				//printing array elements using for each loop
				for (String n: names)
					System.out.println(n);
				
				//printing array elements using for loop
				for (i=0;i<data.length;i++) 
				{
					System.out.println(data[i]);
					}
				
				//printing array elements using for each loop
				System.out.println("using for each loop");
				for (int d:data)
					System.out.println(d);
				
				//another way to print array elements or traverse array
				for (var d:data)//using var means it will handle array of any data type
					//if data type of array will change then use this var
					System.out.println(d);				
			}
	}
