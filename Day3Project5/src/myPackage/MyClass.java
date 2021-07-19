package myPackage;

public class MyClass {

}

class englishMessage {
	public void printHi() {System.out.println("Hi");}
	public void printHello() {System.out.println("Hello");}
	public void printGoodMorning() {System.out.println("GoodMorning");}
	}

class HindiMessage extends englishMessage{
	
	@Override
	public void printGoodMorning() {System.out.println("Subodhay");}
	
}