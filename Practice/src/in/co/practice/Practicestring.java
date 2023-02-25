package in.co.practice;

public class Practicestring {
	public static void main(String[]args) {
		String name = "indore" ;
		System.out.println("4th character is "+ name.charAt(4));
		System.out.println( name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.replace("r", "o"));
		System.out.println(name.replace("e", "r"));  //will always consider the "string name" 
	    System.out.println(name.replace("n", "s"));	 //for all output, don't confuse with previous one
		System.out.println(name.charAt(5));	
}
}