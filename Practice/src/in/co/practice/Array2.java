package in.co.practice;

public class Array2 {
	public static void name(String[]args) {
		char[] copyFrom = {'a','b','c','d','e','f','g','x','y'};
		char[] copyTo = new char[3];
		System.arraycopy(copyFrom, 2, copyTo, 0, 3);
		System.out.println(copyTo);
		
		
		
	}

}
