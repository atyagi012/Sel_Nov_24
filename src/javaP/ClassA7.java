package javaP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClassA7 {

	public void ListExample() {
		//ArrayList = class
		//Declare List
		List<String> myL = new ArrayList<String>();
		
		myL.add("A");
		myL.add("B");
		myL.add("C");
		myL.add("D");
		myL.add("D");
		myL.add("E");
		myL.add("F");
		myL.add("K");
		myL.add("I");
		
		int listSize = myL.size();
		System.out.println(listSize);
		
		System.out.println(myL);
		/*
		 * myL.remove(5); System.out.println(myL);
		 * 
		 * System.out.println(myL.size());
		 */
	}

	public void SetExample() {
		
		Set<String> mySet = new HashSet<String>();
		
		mySet.add("A");
		mySet.add("B");
		mySet.add("V");
		mySet.add("D");
		mySet.add("D");
		mySet.add("E");
		mySet.add("F");
		mySet.add("K");
		mySet.add("I");
		
		System.out.println(mySet.size());
		System.out.println(mySet);
	}
	
	public static void main(String[] args) {
		ClassA7 obj = new ClassA7();
		//obj.ListExample();
		obj.SetExample();
	}
	
}
