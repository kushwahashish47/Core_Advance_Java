package in.co.practice;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Test {
	public static void main(String[]args) throws ParseException {
		Test today = new Test();
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		String strDate = format1.format(today);
		System.out.println("format1:"+ strDate);
		
		SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyyy");
		strDate = format2.format(today);
		System.out.println("format2:" + strDate);
		
	   Date pdate = format1.parse("17/02/2023");
		System.out.println(pdate);
	}

}
