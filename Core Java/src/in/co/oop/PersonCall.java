package in.co.oop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonCall {
public static void main(String[] args) {
	Person p =new Person();
	Date d = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	String str = sdf.format(d);
	
	
	p.setAddress("Tilak Nagar");
	p.setName("Ashish");
//	p.setDate("15/02/2023");
	
	System.out.println(p.getName());
	System.out.println(p.getAddress());
	System.out.println(str);
	System.out.println(p.AVG_AGE());
}
}
