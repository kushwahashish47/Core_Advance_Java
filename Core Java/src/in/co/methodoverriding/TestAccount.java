package in.co.methodoverriding;

public class TestAccount {
	public static void main(String[] args) {
		
		SavingAccount sa = new SavingAccount();
		sa.getAmount();
		System.out.println(sa.getAmount());			//child override parent
	}

}
