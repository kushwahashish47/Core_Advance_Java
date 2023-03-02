package in.co.collectionframework;

import java.util.ArrayList;

public class ToStrng {
	public static void main(String[] args) {
		ArrayList s =  new ArrayList ();
		s.add("One");
		s.add("Two");
		s.add("Three");
		System.out.println(s);
		
		int z = s.size();
		
		for (int i = 0;i<z;i++) {										
//		System.out.println(i + ":"+s.get(i));	
//	
//		Object o = s.get(i);
//		System.out.println(i+":"+o);
		
		Object o = s.get(i);
		System.out.println(i+":"+o.toString());
		
//		System.out.println(s.get(i));
		}		
		
	}

}
