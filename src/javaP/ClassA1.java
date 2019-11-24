package javaP;

public class ClassA1 {

	int i = 16;
	int j = 15;
	
	String s = "Selenium"; 

	public void method1() {
		//System.out.println("Hi");
		
		//Logic 
		//Check which is large number between two
		
		if(i > j) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
	}
	
	public void method2() {
		//Print table = 4
		/*
		 * Loop: for, while, do while
		 */
		/*
		 * System.out.println(i); //16
		 * 
		 * System.out.println(++i); // 17 //inc, Print
		 * 
		 * System.out.println(i++); //17 //Print , inc
		 * 
		 * System.out.println(i); //18
		 */
		for(int i = 0; i<5; ++i) {
			System.out.println(i);
		}
	}
	
	public void whileExample() {
		/*
		 * while(true) { 
		 * System.out.println("Hi"); 
		 * }
		 */
		int t = 1;
		
		while(t<10) {
			System.out.println(t++);
			
			if(t == 5) {
				break;
			}
		}
		
	}	
	
	public void doWhile() {
		//DO yourSelf
		
		/*
		 * do{
		 * task
		 * }
		 * while(true);
		 * 
		 */
	}
	
	//If there are 2 or more methgods of same name in same class then it is called Method Overloading. It happens in same class.
	public void method4(int t) {
		System.out.println("Java");
		System.out.println("t");
		System.out.println(t);
	}
	
	public void method4() {
		System.out.println("Selenium");
	}
	
	
	public static void main(String[] args) {
		ClassA1 obj = new ClassA1();
		//obj.whileExample();
		
		obj.method4(4);
	}
}
