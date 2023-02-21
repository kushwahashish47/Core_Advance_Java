package in.co.datencalendar;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Ssdf {
	public static void main(String[]args) throws ParseException {
		Date today = new Date();
		SimpleDateFormat ft= new SimpleDateFormat("dd/MM/yyyy");    //describe the constructor of your format of date.
		String s = ft.format(today);                               //holding in string type of variable s.
		System.out.println( s);
		
	    Date d = ft.parse(s);                                      //case 1:string to integer conversion, for current date
		System.out.println(d);
		
		Date y = ft.parse("14/02/2022");						  //case 2:type date what you want to convert. 
		System.out.println(y);										
	}

}
