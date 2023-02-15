package in.co.exercise;

public class PrimeNumber2ndM_4_11 {
	public static void main(String[] args) {
		int p= 7;
		int n =0;
		int m = p/2;
		for(int i = 2;i<=m;i++) {
			
		if (p%i==0) {
		
		n++;
		//break;
		}	
		}if (n==0) {
			System.out.println("Given no. is prime");
			}
			else {
				System.out.println("Given number is not prime");
			}
	}

}
