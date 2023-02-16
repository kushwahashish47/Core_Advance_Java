package in.co.oop;

public class AccountTest {
	public static void main(String[] args) {
		Account a = new Account();
		a.setAccountType("Saving Account");
		a.setNumber("25652862962563");
		a.setBalance(90000.25);
		System.out.println(a.getAccountType());
		System.out.println(a.getNumber());
		System.out.println(a.getBalance());
		System.out.println(a.deposit(1000));
		System.out.println(a.withdrawal(87000));
		System.out.println(a.fundTransfer(1500.00));
		System.out.println(a.payBill(500));
		a.balance(1500);
	}
}
