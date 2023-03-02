package in.co.comparableeInterfacee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestMarksheet {
public static void main(String[] args) {
	
	ArrayList Marksheet = new ArrayList();
	Marksheet.add(new Marksheet ("c2","ashish",70));
	Marksheet.add(new Marksheet ("c3","shyam",80));
	Marksheet.add(new Marksheet("c4","Gopal",90));
	
	Collections.sort(Marksheet);
	
	System.out.println(Marksheet);
	for (Object o : Marksheet) {
		System.out.println(o);
	}
	
}
}
