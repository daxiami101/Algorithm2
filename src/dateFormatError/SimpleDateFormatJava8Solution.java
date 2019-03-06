package dateFormatError;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * 测试传统时间格式化的线程安全问题
 */
public class SimpleDateFormatJava8Solution {
    public static void main(String[] args) throws ExecutionException, InterruptedException {


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");

        Callable<LocalDate> task = new Callable<LocalDate>() {
            @Override
            public LocalDate call() throws Exception {
                return LocalDate.parse("20170806", dtf);
            }
        };

        ExecutorService pool = Executors.newFixedThreadPool(100);

        List<Future<LocalDate>> results = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            results.add(pool.submit(task));
        }

        for (Future<LocalDate> future : results) {
            System.out.println(future.get());
        }

        pool.shutdown();
    }
}