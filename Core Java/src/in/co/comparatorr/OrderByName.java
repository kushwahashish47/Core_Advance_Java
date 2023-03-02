package in.co.comparatorr;

import java.util.Comparator;

public class OrderByName implements Comparator<Marksheet> {
	
	
	public int OrderByName(Marksheet m1,Marksheet m2) {
		if (m1.marks>m2.marks) {
			return -1;
		}else if (m1.marks == m2.marks) {
			return 0;
		}else {
			return 1;
		}
	}
	
	public String toString() {
		return null;
		
	}

	@Override
	public int compare(Marksheet m1, Marksheet m2) {	
		return m1.name.compareTo(m2.name);
		}
	
}

