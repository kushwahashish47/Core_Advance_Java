package in.co.practice;

public class CharacterCountInAString {
	public static void main(String[]args) {
		String name = "Vijay Dinanath Chouhan";
		char c = 't';
		int count = 0;
		for (int i =0; i<name.length(); i++){
			if (c==name.charAt(i))
			
			count++;
		}
		System.out.println(count++);
				
	}
	

}
