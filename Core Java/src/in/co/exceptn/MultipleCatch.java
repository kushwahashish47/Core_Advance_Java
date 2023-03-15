package in.co.exceptn;

public class MultipleCatch {
	public static void main(String[] args) {
	String name = null;								// write here d/f name and we get all d/f desired results
	try {
		System.out.println(name.length());
		System.out.println(name.charAt(6));	
	}
	catch(StringIndexOutOfBoundsException r) {
		System.out.println("String Size is small");         //this exceptn occurs that's why we get this output 
	}catch(NullPointerException r ) {
		System.out.println("sk");							//when string name is = to null, then this will print
	}
	finally {
		System.out.println("hi");							//finally will always be there
	}
	}
}
