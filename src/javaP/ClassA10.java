package javaP;

public class ClassA10 {

	int i = 10;
	String s = "Hello";
	
	public ClassA10(int i, String s) {
		
		  this.i = i; 
		  this.s = s;
		 
		/*
		 * i = this.i; s = this.s;
		 */
	}
	
	public void displayValues() {
		System.out.println("i is = " + i);
		System.out.println("s is = " + s);
	}
	
	
	public static void main(String[] args) {
		ClassA10 obj = new ClassA10(3, "Hi");
		obj.displayValues();
	}
	
}
