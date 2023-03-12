package in.co.racewsynchronized;

public class RacingC extends Thread {
	public static Account data = new Account();
	
	public RacingC(String name) {
		super(name);
	}
	public void run() {
		for (int i =0;i<50;i++) {
			data.deposit(getName(), 1000);
		}
	}
}
