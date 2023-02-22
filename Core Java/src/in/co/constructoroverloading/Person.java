package in.co.constructoroverloading;

import java.util.Date;

public class Person {

	private String name = null;
	private String address = null;
	private String place = null;
	
	public Person() {}									// in this program,there are 3 constructor which is known 
														//	constructor overloading
	public Person(String name,String address) {
		this.name = name;								// this.name and this.address can be written as 		
		this.address = address;							// this(n,a) which means the same.
		}
	public Person(String n,String a, String p) {
		name = n;										
		address =a;
		place = p;
		}
	}



