package InputNOutputt;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Scannerr {
	public static void main(String[] args) throws Exception {
																					//check it all
		FileReader r = new FileReader("C:\\Users\\li9\\Eclipse Workspace\\New folder\\Rays.txt");
		Scanner sc = new Scanner(r);
		while(sc.hasNext()) {String line = sc.nextLine();
		System.out.println(line);
		}
	System.out.println(sc.hasNext());
	System.out.println(sc.hasNextDouble());
	System.out.println(sc.next());
	System.out.println(sc.nextLine());
	
	}
}
