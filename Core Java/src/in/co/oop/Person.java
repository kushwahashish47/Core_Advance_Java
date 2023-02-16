package in.co.oop;

import java.util.Date;

public class Person {
	private String name ;
	private Date date;
	private String address ;
    private final static int AVG_AGE = 18;
	
    public void setName(String name) {
	 this.name = name; 
	}
	 public String getName() {
	  return name; 
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
		
	}public void setDate(Date date) {
		this.date= date;
	}
	public Date getDate() {
	return date;
	}
	public int AVG_AGE() {
		return AVG_AGE;
	}
}

