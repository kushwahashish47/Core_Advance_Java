package in.co.practice;

public class ReverseString {
	public static void main(String[] args) {
		
	String name = "Vijay Dinanath Chouhan";
	for( int i = name.length()-1; i>=0 ;i--){		// method 1
	System.out.print(name.charAt(i));
	}
	
	System.out.println("\n");
	
	StringBuffer s = new StringBuffer("Vijay Dinanath Chouhan");  //method 2
	System.out.print(s.reverse());
      
	}
}
