package in.co.exercise;

public class LargestNumberOfArray {

	 public static void main(String[]args) {
	 int ar[]= {34,123,56,7,98};
	 int largest=ar[0];
	 for(int i=1;i<ar.length;i++)
	 {
		 if(largest<ar[i])
		 {
			 largest=ar[i];
		 }
	 }
	 System.out.println(largest);
	 }
}