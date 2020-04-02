package designPattern.decorator.aop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogDecorator extends Decorator{

	public LogDecorator(GoodsSaleEbi ebi) {
		super(ebi);
	}

	@Override
	public boolean sale(String user, String customer, SaleModel saleModel) {
		//执行业务功能
		boolean f = this.ebi.sale(user, customer, saleModel);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		System.out.println("日志记录于："+user+"于"+sdf.format(new Date())+"保存了一条销售记录，客户是："+customer+" 购买记录是："+saleModel);
		return f;
	}

}
