package javaP;

public class ClassA9 implements Interface1{

	@Override
	public void method2() {
		System.out.println(i);
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) {
		ClassA9 obj = new ClassA9();
		/*
		 * int a = obj.i; System.out.println(i);
		 * 
		 */
		
		obj.method2();
	}

	@Override
	public int method4(String s, int t) {
		// TODO Auto-generated method stub
		return 0;
	}

}
