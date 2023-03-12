package in.co.threads;

public class HelloThread extends Thread{
	
	String name =null;
	
	public HelloThread(String n ) {
		name = n;
	}
	public void run() {
		for (int i =0; i<50;i++) {
			System.out.println(i+name);
		}
	}

}
