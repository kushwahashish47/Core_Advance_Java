package in.co.collectionframework;

import java.util.ArrayList;

public class Class1 {
	public static void main(String[] args) {
		
		ArrayList<Comparable> a = new ArrayList<Comparable> ();
		a.add("one");
		a.add("Two");
		a.add("Three");
		a.add(2);														// u can add by this method anything
		a.add(2.22);
		
		
		Integer i = 5;													// another method to add integer
		a.add(i);
		System.out.println(a);	
		
	String value = (String) a.get(2);									// Retrieving value at index postion 2
		System.out.println(value);										
	}
}
