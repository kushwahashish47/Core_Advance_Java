package in.co.practice;
 public class Array1 {
	public static void main(String[]args) {
		int [] number= {1,2,3,4,5,6,7,8,9,10};       // array
		for (int i = 1; i<=number.length;  i++) {    // 1st method is for loop to taking out element of array.  
			System.out.println(i);
		}
		int x = number[2];							// 2nd method is taking individual element out one by one.
		int y = number[3];
		int z = number[4];							// if we want to perform further operations on the element,so we can hold 
													// the element in other variable and then we can easily use it.
		int t = x+y+z;								// compare with last 2nd line.
		System.out.println(x);						
		System.out.println(y);
		System.out.println(z);
		System.out.println(t);
      
		
		for(int n: number) {							// 3rd method is by using foreach loop.
   		System.out.println( n );
		}
   		System.out.println(number[5]);				//some other outputs and conclusions.
		System.out.println(number.length);
	
	
}
}