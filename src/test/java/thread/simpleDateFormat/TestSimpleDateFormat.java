package test.java.thread.simpleDateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 测试传统时间格式化的线程安全问题
 */
public class TestSimpleDateFormat {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

//        Callable<Date> task = new Callable<Date>() {
//            @Override
//            public Date call() throws Exception {
////                return sdf.parse("2014-07-11 12:41:51");
//            	return DateFormatThreadLocal.convert("2014-07-11 12:41:51");
//            }
//        };
        Callable<String> task = new Callable<String>() {
            @Override
            public String call() throws Exception {
//                return sdf.parse("2014-07-11 12:41:51");
            	return DateFormatThreadLocal.convertStr(Calendar.getInstance().getTime());
            }
        };

        ExecutorService pool = Executors.newFixedThreadPool(10);

        List<Future<String>> results = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            results.add(pool.submit(task));
        }

        for (Future<String> future : results) {
            System.out.println(future.get());
        }
    }
}