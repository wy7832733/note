package day01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Try {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date1=sdf.parse("2017-8-10");
		Date date2=sdf.parse("2017-8-13");
		long mills=(date2.getTime()-date1.getTime())/(1000*60*24);
		int days=Integer.parseInt(String.valueOf(mills));
		System.out.println(days);
		
		
	}
}
