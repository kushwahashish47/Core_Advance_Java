package in.co.practice;

public class Reverse2 {
	public static void main(String[]args) {
		String name = "Vijay Dinanath Chouhan";
		String[] s =name.split("  ");
		for (int i = 0; i<s.length;i++) {
			for(int j = s[i].length()-1;j>=0;j--) {
				System.out.print(s[i].charAt(j));
		
			}
			System.out.println("  ");
		}
		
		
		
		
	}

}
