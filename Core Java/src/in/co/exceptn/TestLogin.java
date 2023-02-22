package in.co.exceptn;

public class TestLogin {
	public static void main(String[] args) throws Exception {
		String name = "Vijay";
		if(name.equals("Vijan")) {
			System.out.println("Valid User");
		}
		else {
			throw new LoginException();	
		}
	}
	

}
