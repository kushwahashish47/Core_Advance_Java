package in.co.exercise;

public class ArmstrongNumber_4_10 {
    public static void main(String[]args) {
    	int number = 371;
    	int r;
    	int sum = 0 ;
    	int  n = number;									// n too plays role like sum maybe
    	while(n>0){
    		r=n%10;
    	sum = sum +(r*r*r);									// here sum is used to hold previous result, i think
    	n = n/10;
    	}
    	if(sum == number) {
    		System.out.println("Armstrong Number");}
    	
    		else {
    			System.out.println("It's not a Armstrong Number");
    		}
    	}
    }
