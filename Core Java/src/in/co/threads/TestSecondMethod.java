package in.co.threads;

public class TestSecondMethod {
	public static void main(String[] args) {
																			// see what's happening in this
		Thread t1 = new Thread(new SecondMethod("Suresh"));
		
		Thread t2 = new Thread(new SecondMethod("Gopal"));
		
		t1.start();
		t2.start();
		
		for(int i =0;i<50;i++) {
			System.out.println("main");
		}
	}
}
