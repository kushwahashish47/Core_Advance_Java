package in.co.exceptn;

public class AccountWCustomExceptnP1 {		

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
		public void  withdrawal(double amount1) throws ExceptionAccount{
			balance  = getBalance() - amount1;
			if(balance <2000) {
				throw new ExceptionAccount();
								
			}else {
				System.out.println("after withdrawal balance"+ balance);
				setBalance(balance);	
			}
		}
		public double fundTransfer(double amount) {
			balance = getBalance()- amount;
			return balance;
			
		}
}
