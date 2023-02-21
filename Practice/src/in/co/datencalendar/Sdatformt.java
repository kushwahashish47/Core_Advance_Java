package in.co.datencalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sdatformt {

	public static void main (String[]args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		String date = sdf.format(new Date());
		System.out.println(date);
		
	}

}
