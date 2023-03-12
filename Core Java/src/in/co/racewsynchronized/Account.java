package in.co.racewsynchronized;

public class Account {
	
	private int balance = 0;
	
	public void deposit(String msg,int amt) {
		int bal = getBalance()+amt;
		setBalance(bal);
		System.out.println(msg+"new balance "+bal);
		
	}
		public int getBalance() {
			return balance;
			
		}
		public void setBalance(int balance) {
			this.balance = balance;	
		}
		public void dataBaseDelay() {
			
		}
		
		
}
