package in.co.exceptn;

public class DivisibilityCheckEx1 {
	public static void main(String[] args) {
	
	int a =10;
	int b =0;
	  
	System.out.println("check it");
	try {
		int c= a/b;
		System.out.println(c);
	}
	catch (ArithmeticException z ) {
	System.out.println("Because divided by zero");
	System.out.println(z.getMessage());
	z.printStackTrace();
	}
	}
	}
