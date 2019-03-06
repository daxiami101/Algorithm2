package BigDecimal;

import java.math.BigDecimal;

public class BigDecimalTest {
	public static void main(String[] args) {
		BigDecimal num1=new BigDecimal("1");
		BigDecimal num2=new BigDecimal("7");
		double result=num1.divide(num2,4, BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println("result:"+result);
		 /*BigDecimal b1 = new BigDecimal(Double.toString(1.0));
		   BigDecimal b2 = new BigDecimal(Double.toString(3.0));
		   double result= b1.divide(b2, 4, BigDecimal.ROUND_HALF_UP).doubleValue();
		   System.out.println("result:"+result);*/
	}

}
