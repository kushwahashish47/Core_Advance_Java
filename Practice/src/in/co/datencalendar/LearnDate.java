package in.co.datencalendar;

import java.util.Date;

public class LearnDate {
	public static void main(String[]args) {

		Date y = new Date();  						//take any object y and print it to get date in one line
		  
		
		
        System.out.println("Today's Date is : " + y );
		System.out.println("Minutes "+y.getMinutes()); 	// y. gives a option to you what you want to print
		System.out.println("Hours " + y.getHours());
	}

}
