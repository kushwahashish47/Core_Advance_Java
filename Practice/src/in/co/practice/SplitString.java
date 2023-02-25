package in.co.practice;

public class SplitString {
	public static void main(String[]args) {
		
		String name = "Vijay Dinanath Chouhan";
		String[] s = name.split("");
		for (int i = 0; i<s.length;i++) {
		System.out.print(s[i]);
		}
}   
}