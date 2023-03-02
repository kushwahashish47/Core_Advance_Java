package in.co.constructoroverloading;

import java.util.Date;

public class Person {

	private String name ;
	private String address ;
	private String place ;
	
	public Person() {}									// in this program,there are 3 constructor which is known 
														//	constructor overloading
	public Person(String name,String address) {
		this.name = name;								// this.name and this.address can be written as 		
		this.address = address;							// this(n,a) which means the same.
		}
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getPlace() {
		return place;
	}
	public Person(String n,String a, String p) {
		this(n,a);
		place = p;
		}
	}