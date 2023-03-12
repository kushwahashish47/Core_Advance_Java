package in.co.methodoverriding;

public class TestAccount {
	public static void main(String[] args) {
		
		Accounts s = new SavingAccount();
		s.getAmount();
		
		
		System.out.println(s.getAmount());			//child override parent
	}

}
