package dateFormatError;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * 测试传统时间格式化的线程安全问题
 */
public class TestSimpleDateFormat {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//=====================模拟多线程====================================
        Callable<Date> task = new Callable<Date>() {
            @Override
            public Date call() throws Exception {
//                return sdf.parse("20170806");
                return DateFormatThreadLocal.convert("20180614");//sdf.parse("20170806");
            }
        };
        
//=====================模拟多线程====================================
        ExecutorService pool = Executors.newFixedThreadPool(100);

        List<Future<Date>> results = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            results.add(pool.submit(task));
        }

        for (Future<Date> future : results) {
            System.out.println(future.get());
        }
        
    }
}