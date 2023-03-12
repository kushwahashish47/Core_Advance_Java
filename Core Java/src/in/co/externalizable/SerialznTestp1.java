package in.co.externalizable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialznTestp1 {
	public static void main(String[] args) throws Exception {
		FileOutputStream file =  new FileOutputStream("C:\\Users\\li9\\Eclipse Workspace\\z\\obj.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);

		SerializableWTransient st = new SerializableWTransient();
		st.name = "ak";
		st.physics = 70;									//in this we write data to file and seen that transient 
		st.maths = 75;										// attribute is written in file but in next partp2 we see we 		
		st.total=15;										// we cannot read that attribute
		
		out.writeObject(st);
		
		System.out.println(st.physics);
		System.out.println(st.maths);
		System.out.println(st.total);
	}
}