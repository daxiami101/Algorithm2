package designPattern.decorator.aop;

public class GoodsSaleEbo implements GoodsSaleEbi {

	@Override
	public boolean sale(String user, String customer, SaleModel saleModel) {
			System.out.println(user+"������"
					+customer+"���� "+saleModel+" ����������");
		return true;
	}

}
