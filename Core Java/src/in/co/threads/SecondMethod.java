package in.co.threads;

public class SecondMethod implements Runnable{

	String name =null;
	
	public SecondMethod(String n ) {
		name = n;
	}
	public void run() {
		for (int i =0; i<50;i++) {
			System.out.println(i+name);
		}
	}
}
