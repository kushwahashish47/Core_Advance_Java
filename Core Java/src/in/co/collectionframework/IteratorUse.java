package in.co.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorUse {
public static void main(String[] args) {								//gives value out of list,one by one 3rd method

	ArrayList l = new ArrayList();
	l.add(10);
	l.add(20);
	l.add(30);
		
	System.out.println(l);
	
		Iterator it = l.iterator();										// can be used listIterator second m
	  while(it.hasNext()) {
		System.out.println(it.next());
	}
	  l.remove(2);									
	  System.out.println(l);
}
}
