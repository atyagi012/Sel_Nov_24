package javaP;

public class ClassA2 {

	//Cunst: is a special type of method, which execute automatically when object is created
	//1. Its name must be same as class name
	//2. It doesn't have any return type, not even void
	
	public ClassA2() {
		System.out.println("Java");
	}
	
	public ClassA2(int t) {
		
	}
	
	public void method1() {
		System.out.println("Selenium");
	}

	public void method2() {
		
		String s = "Selenium";
		
		System.out.println(s.charAt(3));
		
		System.out.println(s.contains("ium"));
		
		System.out.println(s.endsWith("T"));
		
		System.out.println(s.isEmpty());
		
		//Assignment : Reverse "Selenium" 
		
		char[] arr = s.toCharArray();
		
		System.out.println(arr[1]);
		
		
	}
	
	public static void main(String[] args) {
		/*
		 * ClassA2 obj = new ClassA2(); obj.method1();
		 */
		
		ClassA2 obj = new ClassA2(4);
		obj.method2();
	}
}
