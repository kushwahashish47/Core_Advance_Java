package in.co.superconstr;

public class Test {
	public static void main(String[] args) {
		
	Employee e1 = new Employee();
	Employee e2 = new Employee("ak" , "indore");
	
	String  s = e2.getName();
	String s1 = e2.getAddress();
	System.out.println(s+"\t"+s1);	
}
}