package in.co.Enumeratn_Vectorr;

import java.util.Enumeration;
import java.util.Vector;

public class Vectorrr {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("one");
		v.add("Two");
		v.add("Three");
		System.out.println(v);
		
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}		
	}
}
