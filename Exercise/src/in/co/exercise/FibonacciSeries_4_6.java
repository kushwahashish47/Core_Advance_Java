package in.co.exercise;

public class FibonacciSeries_4_6 {
	public static void main(String[]args) {
		
		int a = 0,b=1,c=0;									// initail 2 values we have to give as a=0,b=1
		for(int i=0 ; i<10; i++)
		{
        System.out.println(a+ " ");
        c=a+b;
        a=b;
        b=c;
		}
		}
}