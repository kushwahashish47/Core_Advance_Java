package in.co.practice;

public class CountingOfAllLetters {

	public static void main(String[] args) {

		String name = "vijay dinanath chouhan";
		int count = 0;
		for (char j = 'a'; j <= 'z'; j++, count = 0) {

			for (int i = 0; i < name.length(); i++) {
				if (j == name.charAt(i)) {
					count++;
				}
			}
			if (count != 0) {

				System.out.println(j + "=" + count);
			}
			// System.out.println(j);
		}
	}
}
