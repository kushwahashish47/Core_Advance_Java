package in.co.oop;

public class Account {
	private String number;
	private String accountType;
	private double balance;

	public void setNumber(String number) {
		this.number = number;
	}
	public String getNumber() {
			return number;
		}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountType() {
		return accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double deposit(double amount) {
		 balance = getBalance()+ amount;
		return balance;
	}
	public double withdrawal(double amount1){
		balance  = getBalance() - amount1;
		return balance;

	}
	public double fundTransfer(double amount) {
		balance = getBalance()- amount;
		return balance;
		
	}
	public double payBill (double amount) {
		balance = getBalance()- amount;
		return balance;	
	}
	public double balance (double balance) {
	if (balance<2000) {
		System.out.println("This is lein mark,you can't withdraw money");	
	}
	return balance;
}
}
