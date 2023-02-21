package in.co.SuperConstr;

public class Employee extends Person{
	
		public Employee() {
			System.out.println("default of Employee");
		}
		public Employee(String name, String address) {
			super (name, address);
			System.out.println("para of employee class");
	} 
}
