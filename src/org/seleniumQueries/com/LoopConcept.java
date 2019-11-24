package org.seleniumQueries.com;

public class LoopConcept {
	
	 
	  int i=15; 
	  int j=16;
	  
	  public void Method1() {                    //if-else example
	 
	  if (i<j) {
	  
	  System.out.println("True"); }
	  
	  else {
	  
	  System.out.println("False"); }
	  
	  }
	  
	  public void Method2() {                       //increment
	  
	  
	  System.out.println(i);     //15
	  System.out.println(i++); //15
	  System.out.println(++i); //16
	  System.out.println(i); //16
	  
	  
	   
	  for(i=0;i<5;i++) {                        //for loop
	  
	  System.out.println(i); 
	  
	  }
	  
	  
	  int i=1;
	  
	  while(i<10) {                                //while
	  
	  System.out.println(i++);
	  
	  if(i==5) {
	  
	  break; } }
	  
	  }
	
	  public void method3() {
	  
	  System.out.println("selenium");
	  
	  }
	  
	  public void methid3(int i) {               //same class different parameters.
	  
	  System.out.println("selenium"); 
	  
	  System.out.println(i); 
	  
	   }
	  
	  public void DoMethod() {                      // Use of Do-While
		  
		  int i = 1;
		  do {
			  
			  System.out.println(i);
			  ++i;
		  } while(i<=10);
		  
	  }
	  
	  public static void main(String[] args) {
	  
	  LoopConcept obj = new LoopConcept();
	  obj.DoMethod();
	  
	  }
	 

}
