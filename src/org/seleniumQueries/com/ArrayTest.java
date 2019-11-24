package org.seleniumQueries.com;

public class ArrayTest {
	
	
	public void method() {
		
		String s = "selenium";
		String rev="";
		
		
		char[] arr = s.toCharArray();
		
		for(int j = arr.length-1; j>=0; j--) {
			rev = rev + arr[j];
		}
		System.out.println("Rev is = " + rev);
		//=========================================================
		 int lth= s.length();     //to provide string length.
		 
		 
		 for(int i=lth-1; i>=0; i--) {
			 rev= rev + s.charAt(i);   
		 }
		 System.out.println("Reverse of " + s + " is " + rev);
	}
	
	
	public static void main(String[] args) {
		ArrayTest obj= new ArrayTest();
		obj.method();
	}
}
