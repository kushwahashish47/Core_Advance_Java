package in.co.inputnoutputt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileUsingBufferReadr {
	public static void main(String[] args) throws Exception {
		FileReader t = new FileReader("C:\\Users\\li9\\Eclipse Workspace\\New folder\\rays.txt");
		BufferedReader y = new BufferedReader(t);
		int ch = y.read();
		System.out.println(ch);
		String line = y.readLine();
		System.out.println(line);
	}
	
	
}
