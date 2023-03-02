package in.co.comparatorr;

import java.util.Comparator;

public class Marksheet implements Comparator{

	public int rollNo;
	public String name;
	public int marks;
	
	public Marksheet(int r,String n,int m) {
		this.rollNo = r;
		this.name = n;
		this.marks = m;
	}

		public String toString() {
			return rollNo + ","+name+","+marks;
		}
}	





