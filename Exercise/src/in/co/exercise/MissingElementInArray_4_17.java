package in.co.exercise;

public class MissingElementInArray_4_17 {
	public static void main(String[]args) {

		int sum1 = 0;
		int sum2 = 0;
		int [] x = {10,20,30,40,50};
		int [] y = {10,30,40,50};
		
	 for (int i = 0 ;i<x.length;i++) {
		// System.out.println(x[i]);
		 sum1 = sum1 + x[i] ;	 
	 }
//	 System.out.println(sum1);
	 
	 for (int j = 0; j<y.length; j++) {
		 sum2 = sum2 + y[j];
	 }
//	 System.out.println(sum2);
	 System.out.println("missing element in array is " + (sum1-sum2));
	 }
}