package in.co.exercise;

public class DivisibleBySeven_4_7 {
	public static void main(String[]args) {
		int sum = 0;
		for(int i=100;i<=200;i++){
	
			if (i%7==0) {
			sum = sum +i;
		
			System.out.println("Number divisible by seven is " + i);
			}
		}
		System.out.println("Sum of all integers b/t 100 to 200, which are divisible by seven is " +sum);
		
		}
	
}

