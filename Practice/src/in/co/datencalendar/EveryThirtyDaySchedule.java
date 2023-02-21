package in.co.datencalendar;

import java.util.Calendar;
import java.util.Date;

public class EveryThirtyDaySchedule {
	public static void main(String[]args) {
		
		Date d= new  Date();
		Calendar c = Calendar.getInstance();
		c.setTime(d);

		System.out.println("Maintenance date after every 30 days " +"\n");
			
		for(int i=0; i<12; i++) {
			c.add(Calendar.DATE, 30);
		System.out.println(c.getTime());
		}
	}

}
