package in.co.collectionframework;

import java.util.Vector;

public class Vectorr {
public static void main(String[] args) {
	
	Vector v = new Vector();
	v.add("java");
	v.add("is");
	v.add("Easy");
	v.add("to");
	v.add("Understand if work on it");
	 System.out.println(v);
	 
	Integer u = new Integer(6);
	v.add(u);
	
	Integer value = (Integer)v.get(5);
	System.out.println( value);	
}
}