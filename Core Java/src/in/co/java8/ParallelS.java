package in.co.java8;

import java.util.Arrays;

public class ParallelS {

	public static void main(String[] args) {
		
	int [] pq = {0,11,3,4,5,6,15,2,4,5,7,};
	
	for (int i : pq) {
		System.out.print(i+" ");
	}
	System.out.println(" after "+"\n");

	Arrays.parallelSort(pq);
	for (int i : pq) {
		System.out.print(i+" ");
	}
}
}
