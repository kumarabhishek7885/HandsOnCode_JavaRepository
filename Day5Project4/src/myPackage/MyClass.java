package myPackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern p = Pattern.compile("\\D{3}");
		Matcher m = p.matcher("INDI");
		
		if(m.matches())
			System.out.println("VALID CODE");
		else
			System.out.println("IN-VALID CODE");
	}

}
