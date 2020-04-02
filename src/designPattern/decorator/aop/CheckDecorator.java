package designPattern.decorator.aop;

public class CheckDecorator  extends Decorator{

	public CheckDecorator(GoodsSaleEbi ebi) {
		super(ebi);
	}

	@Override
	public boolean sale(String user, String customer, SaleModel saleModel) {
		if(!"张三".equals(user)){
			System.out.println("对不起，"+user+"没有保存销售单的权限");
		}else{
			return false;
		}
		return this.ebi.sale(user, customer, saleModel);
	}

}
