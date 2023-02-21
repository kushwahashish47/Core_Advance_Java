package in.co.datencalendar;

import java.util.Date;
import java.util.Calendar;

public class LearnCal {
	public static void main(String[]args) {
		
		Date d = new Date();
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		cal.setTime(d);                            //for the current time to set
		System.out.println(cal.getTime());
		 
//		int year = cal.get(Calendar.DAY_OF_YEAR);  // for current day in calendar
//		System.out.println(year);
		
		cal.add(Calendar.DATE,-1);                 // for yesterday date
		Date yesterday = cal.getTime();
		System.out.println(yesterday);
		
		cal.add(Calendar.DATE,30);                 //for after one month
		Date month =cal.getTime();
		System.out.println(month);
	}
	

}
