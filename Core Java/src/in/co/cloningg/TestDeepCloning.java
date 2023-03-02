package in.co.cloningg;

public class TestDeepCloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Customer c1 = new Customer("Ram");
		Customer c2 = (Customer)c1.clone();
		c2.name = "Balram";
		c2.account.balance = 20;
		
		System.out.println("Original object");
		System.out.println("Name :" + c1.name);
		System.out.println("Balance:" + c1.account.balance);
		
		System.out.println("Cloned object");
		System.out.println("Name : " + c2.name);
		System.out.println("Balance : " + c2.account.balance);
	}
}
