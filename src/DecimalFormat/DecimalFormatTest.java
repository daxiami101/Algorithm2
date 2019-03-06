package DecimalFormat;

import java.text.DecimalFormat;

public class DecimalFormatTest {
	public static void main(String[] args) {
		/*int a=150;
		int b=1576;
		double result=((int)((a*1.0/b)*100))/100.0;
		
		System.out.println("result:"+result);*/
		DecimalFormat df = new DecimalFormat("0.0000");
		double d = 50*1.0/1576; 
		String db = df.format(d);
		
		System.out.println("result:"+db);
	}

}
