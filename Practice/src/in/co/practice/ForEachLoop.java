package in.co.practice;

public class ForEachLoop {
	
	public static void main(String[]args) {
		int[] numbers = {2,4,6,8,10,12};				// by foreach loop,taking out value of atr
		for(int n: numbers) {
		System.out.println( n );
		
	}
		int [] number= {1,2,3,4,5,6,7,8,9,10};			// by for loop ,taking out values of array
		for (int i = 0; i<number.length;  i++) {
			System.out.println(i);
		}
	}
}
