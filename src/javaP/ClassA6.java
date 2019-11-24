package javaP;

public class ClassA6 extends ClassA5{

	public void method1() {
		System.out.println("ClassA6 : method1");
		super.method1();    //method from classA5 will be called
	}
	
	public void FinallyExample() {
		//Code = DB connection Open
		
		int t = 10;
		int d;
		try {
			d = t/0;    //will generate exception
		}
		
		catch(Exception ex) {
			System.out.println("Can not divide by zero.");
		}
		
		System.out.println("Java");
	}
	
	public void method2() {
		
		int[] arr = {5, 4, 3, 2, 1, 10};
		
		//arr.
		
		System.out.println(arr[0]);
		
		try {
			System.out.println(arr[3]);
		}
		
		/*
		 * catch(Exception ex) { System.out.println("This is not a valid index."); }
		 */
		
		finally {
			System.out.println("This will run always.");
		}
		
	}
	
	public static void main(String[] args) {
		ClassA6 obj = new ClassA6();
		//obj.FinallyExample();
		obj.method2();
	}
}
