package in.co.exceptn;

public class Tessst {
public static void main(String[] args) {
	
	AccountWCustomExceptn d = new AccountWCustomExceptn();

   

	d.setBalance(10000);
	System.out.println(d.deposit(500));
	System.out.println(d.withdrawal(8000));
	System.out.println(d.withdrawal(1000));

	
}
}
