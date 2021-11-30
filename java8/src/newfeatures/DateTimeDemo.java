package newfeatures;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d1=new Date();
		System.out.println(d1);
		System.out.println(d1.getDate());
		System.out.println(d1.getHours()+":"+ d1.getMinutes()+":"+ d1.getSeconds());
		
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.getTime());
		
		System.out.println("**Java8 Date & Time Classes**");
		
		LocalDate d=LocalDate.now();
		LocalTime t=LocalTime.now();
		LocalDateTime dt=LocalDateTime.now();
		
		System.out.println("Date and time is: "+d+" " +t);
		System.out.println("Before Formatting :"+dt);
		
		LocalDateTime dt2=dt.minusDays(100);
		System.out.println(dt2);

		LocalDateTime dt3=dt.plusDays(50);
		System.out.println(dt3);
		
		//Java Clock class is used to provide an access to the current,
		//date and time using a time zone.
		
		
		DateTimeFormatter format= DateTimeFormatter.ofPattern("EEEE dd-MM-yyyy HH:mm:ss");
		String dt1=dt.format(format);
		System.out.println("Afer Formatting :"+dt1);
		
		Clock c1=Clock.systemDefaultZone();
		System.out.println(c1.getZone());
		
		Clock c2=Clock.systemUTC();
		System.out.println(c2.instant());
		
		//Zoned Date time to deal with various time zones
		ZoneId z1=ZoneId.of("Asia/Tokyo");
		LocalTime t1=LocalTime.now(z1);
		System.out.println("Japan Time is :"+t1);
		
		ZonedDateTime z2=ZonedDateTime.now();
		System.out.println(z2.getZone()+" "+z2.getDayOfWeek());
		System.out.println(z2);
		
				
	}

}