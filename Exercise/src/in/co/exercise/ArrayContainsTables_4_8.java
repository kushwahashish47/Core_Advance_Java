package in.co.exercise;

public class ArrayContainsTables_4_8 {

	public static void main(String[] args) {
		int [][]a = new int[9][10];
		for (int i = 1; i <=a.length+1  ; i++) {
			for (int j = 2; j <= a.length; j++) { 
				System.out.print(i*j + "\t");
			}
			System.out.println();
		}
		}
	}