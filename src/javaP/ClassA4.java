package javaP;

public class ClassA4 extends ClassA3{

	public void method1() {
		//System.out.println("method 1 - ClassA4");
		
		super.method1();
	}
	
	public void method4() {
		System.out.println("method 4 - ClassA4");
	}
	
	
	public static void main(String[] args) {
		ClassA4 obj = new ClassA4();
		obj.method1();   //Always child class method will be called
	}
}
