 package in.co.practice;

public class Switch {
	public static void main(String[]args) {
		int size =args.length;
		switch (size) {
		case 1 :
			System.out.println("my name is "+ args[0]);
			break ;
		case 2 : 
			System.out.println(args[2]);
			break;
		case 3 : 
			System.out.println(args[2]);
			break;
			default:
			
			System.out.println("none of the above");			
		}	
	}
}
