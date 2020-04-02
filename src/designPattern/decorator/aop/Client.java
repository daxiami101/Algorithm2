package designPattern.decorator.aop;

public class Client {

	public static void main(String[] args) {
		GoodsSaleEbi ebi = new CheckDecorator(new LogDecorator(new GoodsSaleEbo()));
		SaleModel model=new SaleModel();
		model.setGoods("Moto �ֻ�");
		model.setSaleNum(2);
		
		ebi.sale("����", "����", model);
		ebi.sale("����2", "����", model);
	}
}
