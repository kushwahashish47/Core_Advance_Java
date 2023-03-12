package in.co.inputnoutputt;

import java.io.FileWriter;
import java.io.IOException;

public class Writeee {
	public static void main(String[] args) throws Exception {
		FileWriter w =new FileWriter("C:\\Users\\li9\\Eclipse Workspace\\New folder\\ashish.txt");
		char[] cArray = {'H','i'};
		w.write(cArray);
		w.write(',');
		w.write("how is going all?");

		System.out.println(w);
//		w.close();		
	}

}
