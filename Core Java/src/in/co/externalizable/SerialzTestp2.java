package in.co.externalizable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class SerialzTestp2 {
	public static void main(String[] args) throws Exception {
		
	FileInputStream in = new FileInputStream("C:\\Users\\li9\\Eclipse Workspace\\z\\obj.txt");
	ObjectInputStream oi = new ObjectInputStream(in);
	
	SerializableWTransient s1 = (SerializableWTransient) oi.readObject(); 
	
	System.out.println(s1.maths);
	System.out.println(s1.physics);
	System.out.println(s1.total);
	}
}
