package in.co.java8;

public class Testt {
public static void main(String[] args) {

		Fi xyz = new Fi() {

			@Override
			public void say() {
				System.out.println("hello");	
			}	
		};
		
		xyz.say();
}			

}