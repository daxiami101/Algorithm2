package designPattern.decorator.aop;

public class CheckDecorator  extends Decorator{

	public CheckDecorator(GoodsSaleEbi ebi) {
		super(ebi);
	}

	@Override
	public boolean sale(String user, String customer, SaleModel saleModel) {
		if(!"����".equals(user)){
			System.out.println("�Բ���"+user+"û�б������۵���Ȩ��");
		}else{
			return false;
		}
		return this.ebi.sale(user, customer, saleModel);
	}

}
