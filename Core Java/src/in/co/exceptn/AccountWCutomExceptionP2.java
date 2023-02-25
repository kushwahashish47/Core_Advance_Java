package in.co.exceptn;

public class AccountWCutomExceptionP2 {
	public static void main(String[] args) {
		
		AccountWCustomExceptnP1 acc = new AccountWCustomExceptnP1();
		
		acc.setBalance(10000);
		
	System.out.println(acc.getBalance());
	System.out.println("after deposit : " + acc.deposit(5000));
	try {
		acc.withdrawal(14000);
	} catch (ExceptionAccount e) {
		
		System.out.println(e.getMessage());
	}
	}

}
