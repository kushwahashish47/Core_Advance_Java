package in.co.datencalendar;

import java.util.Calendar;
import java.util.Date;

public class CalClass {
	public static void main(String[]args)
	{
		Calendar cal = Calendar.getInstance();						
		
		System.out.println("Date "+cal.get(Calendar.DATE));			// type1 : select from dropdown when we type (.get)
		System.out.println("Month is "+cal.get(Calendar.MONTH));
		System.out.println("Year is "+cal.get(Calendar.YEAR));
		System.out.println("Full Date"+cal.getTime());		// another way to get current date 
		
		cal.add(Calendar.DATE,-1);                 //type2: for yesterday date
		Date yesterday = cal.getTime();
		System.out.println(yesterday);
		
		cal.add(Calendar.DATE,30);                 //type2:for after one month
		Date month =cal.getTime();
		System.out.println(month);
		
		
	}

}
