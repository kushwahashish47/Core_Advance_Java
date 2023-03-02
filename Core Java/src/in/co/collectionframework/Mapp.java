package in.co.collectionframework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Mapp {

	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put( "Ram",101);
		m.put( "Mohan",102);
		m.put( "Shyam",103);
		System.out.println(m);
		System.out.println(m.get(1));
		
		Integer i = (Integer)m.get(103);
		Set keys = m.keySet();
		Collection cs = m.values();
		System.out.println(i);
		System.out.println(cs);
		System.out.println(m);
		
	}
}
