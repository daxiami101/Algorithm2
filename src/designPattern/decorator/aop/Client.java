package designPattern.decorator.aop;

public class Client {

	public static void main(String[] args) {
		GoodsSaleEbi ebi = new CheckDecorator(new LogDecorator(new GoodsSaleEbo()));
		SaleModel model=new SaleModel();
		model.setGoods("Moto 手机");
		model.setSaleNum(2);
		
		ebi.sale("张三", "李四", model);
		ebi.sale("张三2", "李四", model);
	}
}
