package in.co.practice;
import java.util.*;
import java.text.SimpleDateFormat;


public class Date {
	public static void main(String[]args) {
		Date today = new Date();
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yy");
		String strDate = format1.format(today);
		System.out.println("format1:"+ strDate);
		
		SimpleDateFormat format2 = new SimpleDateFormat("MMM dd,yyyy");
		strDate = format2.format(today);
		System.out.println("format2:" + strDate);
		
		Date pDate = format1.parse("17/02/2023");
		System.out.println(pDate);
	}

}
