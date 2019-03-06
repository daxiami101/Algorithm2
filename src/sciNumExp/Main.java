package sciNumExp;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Main {
	public static void main(String[] args) {
        double d = 123456789.128d;
        String s1 = big(d);
        String s2 = big2(d);
        System.out.println(d);
        System.out.println(s1);
        System.out.println(s2);
    }

// 方法一：NumberFormat
    private static String big(double d) {
        NumberFormat nf = NumberFormat.getInstance();
        // 是否以逗号隔开, 默认true以逗号隔开,如[123,456,789.128]
        nf.setGroupingUsed(false);
        // 结果未做任何处理
        return nf.format(d);
    }

//方法二： BigDecimal
    private static String big2(double d) {
        BigDecimal d1 = new BigDecimal(Double.toString(d));
        BigDecimal d2 = new BigDecimal(Integer.toString(1));
        // 四舍五入,保留2位小数
        return d1.divide(d2,2,BigDecimal.ROUND_HALF_UP).toString();
    }
}
