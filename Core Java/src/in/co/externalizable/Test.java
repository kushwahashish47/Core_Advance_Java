package in.co.externalizable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test {
	public static void main(String[] args) throws Exception  {
		Marksheet m = new Marksheet();
		m.name = "rays";
		m.chemistry = 76;
		m.physics= 75;
		m.total =100;
		FileOutputStream file =  new FileOutputStream("C:\\Users\\li9\\Eclipse Workspace\\z\\obj.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);

											
		out.writeObject(m);
		
		System.out.println(m.physics);
		System.out.println(m.chemistry);
		System.out.println(m.total);
	}
}
