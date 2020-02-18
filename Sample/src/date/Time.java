package date;
import java.time.*;

public class Time {
	public static void main(String args[])
	{
	LocalDateTime dateTime= LocalDateTime.now();
	System.out.println(dateTime);
	LocalDate  s= LocalDate.now();
	System.out.println(s);
	LocalTime u= LocalTime.now(); 
	System.out.println(u);
	LocalDate  m= LocalDate.now().plusDays(2);
	System.out.println(m);
 	System.out.println(dateTime.getMonth());
 	System.out.println(dateTime.getYear());
 	System.out.println(dateTime.getDayOfYear());
 	System.out.println(dateTime.getHour());
	}
}
