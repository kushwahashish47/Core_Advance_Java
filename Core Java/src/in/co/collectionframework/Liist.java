package in.co.collectionframework;

import java.util.ArrayList;

public class Liist {
	public static void main(String[] args) {
		ArrayList s =  new ArrayList ();
		s.add("One");
		s.add("Two");
		s.add("Three");
		System.out.println(s);
		System.out.println(s.size());
		
		int t = s.size();
		
		for (int i = 0;i<t;i++) {											//try with foreach loop
		System.out.println(i+":"+s.get(i));	
		}		
		}
}