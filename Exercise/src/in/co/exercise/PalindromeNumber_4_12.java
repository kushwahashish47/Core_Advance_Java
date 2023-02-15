package in.co.exercise;

public class PalindromeNumber_4_12 {
public static void main(String[] args) {
	int num = 151;
	int reverse = 0 ;
	int remainder = 0 ;
	int count = 0;
	int rem = num;
	while(num>0) {
		remainder = num%10;
		num = num/10;
		reverse =reverse*10+remainder;
		count++;

	}
		System.out.println("Digit in number num = " + count);
		System.out.println(reverse);
//		System.out.println(num);
		if(rem==reverse) {
			System.out.println("palindrome");
		}
			else {
				System.out.println("Number is not a palindrome number");
			}
		}
}


	
	
