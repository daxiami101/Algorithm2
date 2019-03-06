package Timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarToString {
	public static void main(String[] args) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Calendar time=Calendar.getInstance();
	
		System.out.println("time:"+	sdf.format(time.getTime()));
	}

}
