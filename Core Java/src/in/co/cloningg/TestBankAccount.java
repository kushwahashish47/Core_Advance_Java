package in.co.cloningg;

public class TestBankAccount {
public static void main(String[] args) throws CloneNotSupportedException {
	

	BankAccount a1 = new BankAccount(10);
	BankAccount a2 = (BankAccount) a1.clone();
//	a2.balance = 20;
	
	System.out.println(a1.balance);
	System.out.println(a2.balance);
}	
}
