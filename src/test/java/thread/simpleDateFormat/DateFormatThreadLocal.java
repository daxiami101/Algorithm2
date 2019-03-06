package test.java.thread.simpleDateFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 */
public class DateFormatThreadLocal {

    private static final ThreadLocal<DateFormat> df = new ThreadLocal<DateFormat>() {
        protected DateFormat initialValue() {
        	
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };

    public static Date convert(String source) throws ParseException {
        return df.get().parse(source);
    }
    public static String convertStr(Date date) throws ParseException {
        return df.get().format(date);
    }
}
