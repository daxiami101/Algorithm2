package designPattern.decorator.aop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogDecorator extends Decorator{

	public LogDecorator(GoodsSaleEbi ebi) {
		super(ebi);
	}

	@Override
	public boolean sale(String user, String customer, SaleModel saleModel) {
		//ִ��ҵ����
		boolean f = this.ebi.sale(user, customer, saleModel);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		System.out.println("��־��¼�ڣ�"+user+"��"+sdf.format(new Date())+"������һ�����ۼ�¼���ͻ��ǣ�"+customer+" �����¼�ǣ�"+saleModel);
		return f;
	}

}
