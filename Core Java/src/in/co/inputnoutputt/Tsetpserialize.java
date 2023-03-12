package in.co.inputnoutputt;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Tsetpserialize {
	public static void main(String[] args) throws Exception {
	
	FileOutputStream file = new FileOutputStream("C:\\Users\\li9\\Eclipse Workspace\\New folder\\test.txt");
	ObjectOutputStream out = new ObjectOutputStream(file);
	MarksheetBean m = new MarksheetBean();
	m.setName("Ram");
	out.writeObject(m);
	
	System.out.println("check the file , u got some binary code written in that blank file");
	
	}
}
