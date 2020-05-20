package designPattern.decorator02;

import java.util.Date;

public class SumPrizeDecorator extends Decorator{

	public SumPrizeDecorator(Component component) {
		super(component);
	}
	
	@Override
	public double calcPrize(String user, Date begin, Date end) {
		double calcPrize = super.calcPrize(user, begin, end);
		System.out.println("========SumPrizeDecorator=================");
		return calcPrize *0.2;
	}

}
