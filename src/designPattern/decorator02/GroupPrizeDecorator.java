package designPattern.decorator02;

import java.util.Date;

public class GroupPrizeDecorator extends Decorator{

	public GroupPrizeDecorator(Component component) {
		super(component);
	}
	
	@Override
	public double calcPrize(String user, Date begin, Date end) {
		double calcPrize = super.calcPrize(user, begin, end);
		System.out.println("========GroupPrizeDecorator=================");
		return calcPrize *0.1;
	}

}
