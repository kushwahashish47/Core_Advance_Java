package in.co.SuperConstr;

import java.util.Date;

public class Person {

		private String name ;
		private Date date;
		private String address ;
	    public final static int AVG_AGE = 18;
		
	    public Person() {
	    	System.out.println("This is Default Constructor");
	    }
	     public Person(String name,String address) {
		 this.name = name; 
		 this.address = address;
		}
		 public String getName() {
		  return name; 
		
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
