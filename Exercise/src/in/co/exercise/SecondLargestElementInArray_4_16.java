package in.co.exercise;

public class SecondLargestElementInArray_4_16 {

	public static void main(String[] args) {
		int [] a = {10,20,30,40,14,12,25};
		int temp;
		for(int i = 0;i<a.length; i++) {
			for (int j = i+1; j<a.length;j++) {
				if (a[i]<a[j]) {
					temp = a[i];
					a[i]= a[j];
					a[j]= temp;
					}
		}
		}	
		System.out.println("Second Largest no. is " + a[1]);
	}
}
