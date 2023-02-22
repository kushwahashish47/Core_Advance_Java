package in.co.exercise;

public class AverageOfNEvenOddNo_4_14 {
	public static void main(String[] args) {
	double even = 0;
	double odd = 0;
	for (int i = 1;i<=10;i++) {
		if (i%2==0) {
			even =even + i;		
		}
		else {
			odd = odd +i;
		}
	}
	System.out.println("Average of even no.b/t 1 to 10 is ="+even/2);
	System.out.println("Average of odd no. b/t 1 to 10 is ="+odd/2);
	double z = even/2 + odd/2;
	System.out.println("Average of 10 odd and even no. is ="+z);
	}
	}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int sum = 0;
//		for(int i=0;i<=10;i++) {
//			
//			sum = sum + i*2;
//			System.out.println(sum/2);
//			
//	}
//		for(int i=1;i<20;i++) {
//			 
//			System.out.print(i+" ");
//			i++;
//		}
////		System.out.println();
//	
//	}
	
	

