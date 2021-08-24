package myPackage;

import java.io.FileWriter;
import java.io.IOException;

public class writeToFile {

	public static void main(String[] args) throws IOException {
		
		//creating FileWriter object to write into file 		
		FileWriter fw = new FileWriter("F:\\sometext.txt",true);//appending text using "true"
		
		//writing into a file using FileWriter object
		fw.write("\nKumar Abhishek is Developer");
		
		fw.close();
		System.out.println("File writing done");
	}

}
