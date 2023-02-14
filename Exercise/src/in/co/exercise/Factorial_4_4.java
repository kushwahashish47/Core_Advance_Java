package in.co.exercise;

public class Factorial_4_4 {
//	public static void main(String[] args) {
//		int number = 5;
//		int z = 1;
//		for (int i= 1;i<=number;i++) {
//			z = z *i;
//			
//		}
//		System.out.println(z);
//	}
//
//}
   
	public static void main(String[] args) {
		int number = 5, fact = 1;
		for (int i=number;i>=1;i--) {
			fact = fact*i;
			
		}
			
		System.out.println(fact);
	}
}

