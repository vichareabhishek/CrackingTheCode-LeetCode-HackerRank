package Strings;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateValidator {

	public static void main(String[] args) {
		String s ="30/25/2014";
		Date date = null;
		try {
		    SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		    date = sdf.parse(s);
		    if (!s.equals(sdf.format(date))) {
		        date = null;
		    }
		} catch (ParseException ex) {
		    ex.printStackTrace();
		}
		if (date == null) {
		    System.out.println("-1");
		} else {
		    System.out.println("1");
		}
			
		
	}
}
