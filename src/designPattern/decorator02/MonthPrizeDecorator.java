package designPattern.decorator02;

import java.util.Date;

public class MonthPrizeDecorator extends Decorator{

	public MonthPrizeDecorator(Component component) {
		super(component);
	}
	
	@Override
	public double calcPrize(String user, Date begin, Date end) {
		double calcPrize = super.calcPrize(user, begin, end);
		System.out.println("========MonthPrizeDecorator=================");
		return calcPrize *0.1;
	}

}
