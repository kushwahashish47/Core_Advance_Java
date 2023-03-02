package in.co.collectionframework;

import java.util.ArrayList;
public class CI {
	public static void main(String[] args) {
		ArrayList s = new ArrayList();
		ArrayList s2 =new ArrayList();

	s.add(100);
	s.add(200);
	s.add(300);
	System.out.println(s);
	
	s2.add("ram");
	s2.add("from");
	s2.add("indore");
	
	System.out.println(s.size());
	System.out.println(s2);
	System.out.println(s2.addAll(s));
	System.out.println(s2);
	}
}