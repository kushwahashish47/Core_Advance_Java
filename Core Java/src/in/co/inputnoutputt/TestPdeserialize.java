package in.co.inputnoutputt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class TestPdeserialize {
public static void main(String[] args) throws Exception {
	FileInputStream file = new FileInputStream("C:\\Users\\li9\\Eclipse Workspace\\New folder\\test.txt");
	ObjectInputStream in = new ObjectInputStream(file);
	
	MarksheetBean m = (MarksheetBean)in.readObject();
	System.out.println(m.getName());
}
}
