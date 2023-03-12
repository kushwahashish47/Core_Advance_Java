package in.co.inputnoutputt;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAFile {
	public static void main(String[] args) throws Exception {
		FileReader rd = new FileReader("C:\\Users\\li9\\Eclipse Workspace\\New folder\\Rays.txt");
		int chr = rd.read();
		while (chr != -1) {
			System.out.print((char) chr);
			chr = rd.read();
		}
		rd.close();
	}
}
