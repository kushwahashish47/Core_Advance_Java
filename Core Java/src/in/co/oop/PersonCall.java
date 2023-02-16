package in.co.oop;

public class PersonCall {
public static void main(String[] args) {
	Person p =new Person();
	p.setAddress("Tilak Nagar");
	p.setName("Ashish");
//	p.setDate("15/02/2023");
	
	System.out.println(p.getName());
	System.out.println(p.getAddress());
	System.out.println(p.getDate());
	System.out.println(p.AVG_AGE());
}
}
