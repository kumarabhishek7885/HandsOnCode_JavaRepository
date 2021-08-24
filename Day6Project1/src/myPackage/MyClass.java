package myPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MyClass 
{
			public static void main(String[] args) 
		{
					try {
					//step-1 Create file object
					File fl = new File("F:\\1.txt");
					
					//getting file name
					//System.out.println("File Name : "+ fl.getName());
					
					//getting file path
					//System.out.println("Complete Path of file: "+fl.getPath());
					
					//checking if file exists or not
					//System.out.println("File exists or not : "+fl.exists());//returns true if file exists
					
					//steps to display the contents of file
					//Step-2 Create file Reader object
					FileReader fr = new FileReader(fl);//file reader means reading character by character
					
					int i= fr.read();//reading character in integer format
					
					//Step-3 give file reader to Buffered Reader to get line by line
					BufferedReader br = new BufferedReader(fr);
					
					
					String line = br.readLine();
					
					while(line!=null)//for BufferedReader end of file is null
					{
//						System.out.println("Contents of file is :");
//						while(i!=-1) //read till end of file means last character of file
//						{ //for fileReader end of file is -1
//							System.out.print((char)i);//type casting integer to char to print file contents
//							i=fr.read();//this is just like i++ reading every character
//						}
						
						System.out.println(line);
						line = br.readLine();
					}	
					br.close();
					fr.close();
					}
					catch(Exception ex)
					{
						
					}
		}
	}


