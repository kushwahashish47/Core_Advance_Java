package in.co.racingex2;

public class Account {
	
	private int balance = 0;
	
	public int getBalance() {
		return balance;
		
	}
	public void setBalance(int balance) {							// type thread.sleep u will get option about millisecond and nanosecond
			try {													// after that try catch and throw throws declaration comes, select try catch then that automatically gives all conditions							
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.balance = balance;
		
		
	}
	public  void deposit(String msg,int amount) {				// apply Thread.sleep and try catch here to for desired output
		int bal = getBalance();
		bal = bal +amount;
		setBalance(bal);
		System.out.println(msg+" new balance = "+bal);
		
	}

}
