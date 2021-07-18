package HandsOnPractice;
//import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(Sysytem.in);
		
		String name = "Abhishek";
		System.out.println(name);

		//length() method
		System.out.println(name.length());
		
		//toLowerCase() method
		System.out.println(name.toLowerCase());
		
		//toUpperCase() method
		System.out.println(name.toUpperCase());
		
		//substring() method
		System.out.println(name.substring(2));
		
		//substring() method
		System.out.println(name.substring(2, 5));
		
		System.out.println("     Abhishek     ");
		
		//trim() method
		System.out.println(name.trim());
		
		//charAt() method reads first character of string
		System.out.println(name.charAt(0));
		
		//compareTo() method
		String myname = "abhi";
		//System.out.println(name.compareTo(myname));
		
		// replace() method
		//System.out.println(name.replace("A", "ab"));
		
		System.out.println(name.startsWith("kbh"));//check whether string starts with "kbh"
		System.out.println(name.endsWith("ek"));//check whether string ends with "ek"
		
		System.out.println(name.indexOf("k"));//returns the index of "k"
		
		System.out.println(name.indexOf("is", 4));
		
		System.out.println(name.lastIndexOf(0));
		
		System.out.println(name.equals("Abhishek"));
		System.out.println(name.equals(myname));
		
		System.out.println(name.equalsIgnoreCase("abhishek"));
		
		System.out.println("hi abhishek \n' how are you");
		System.out.println("hi abhishek \t' how are you");
		System.out.println("hi abhishek \n' how are you");
	}

}
