package myPackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileClass 
{

	public static void main(String[] args) throws IOException 
	{
			var allLines = Files.readAllLines(Paths.get("F:\\sometext.txt"));
			
			for(var a:allLines)
				System.out.println(a);
	}

}
