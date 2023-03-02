package in.co.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class ReadAllEle {
public static void main(String[] args) {
	ArrayList y = new ArrayList();
	y.add("Ram");
	y.add("Gopal");
	y.add("Mohan");
	
	Iterator t = y.iterator();
	
	while(t.hasNext()) {
		Object o =t.next();
		System.out.println(o);
	}	
	 while(t.hasNext()) {
		 Object object = (Object)t.next();
		 System.out.println(object);
	 }
}

}
