package in.co.comparatorr;

import java.util.ArrayList;
import java.util.Collections;

public class Testcomparatorr {
	public static void main(String[] args) {
		ArrayList<Marksheet> ar  = new ArrayList<Marksheet>();
		
		ar.add(new Marksheet(10,"Ram",90));
		ar.add(new Marksheet(20,"Gopal",95));
		ar.add(new Marksheet(30,"Mohan",97));
	
	
		for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
		
		
	OrderByName cName = new OrderByName();
		Collections.sort( Marksheet ,cName);
//		
		System.out.println(cName);
//		System.out.println(Marksheet);
	}

}
