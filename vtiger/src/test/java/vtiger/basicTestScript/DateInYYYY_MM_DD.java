package vtiger.basicTestScript;

import java.time.LocalDateTime;
import java.util.Date;

public class DateInYYYY_MM_DD {

	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.now();
		System.out.println(date);
		
		String month = "0"+date.getMonthValue();
		
		int day = date.getDayOfMonth();
		System.out.println(day);
		
		int year = date.getYear();
		System.out.println(year);
		
		System.out.println(year+"-"+month+"-"+day);
		
		
//		Date date=new Date();
//		String sysDate = date.toString();
//		System.out.println();
//		String year = sysDate.substring(24);
//		System.out.println(year);
//		
//		int month = date.getMonth();
//		System.out.println(month+1);
	}

}
