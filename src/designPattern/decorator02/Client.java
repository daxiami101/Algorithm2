package designPattern.decorator02;

public class Client {
	public static void main(String[] args) {

		Component component = new ConcreteComponent();

		Decorator decorator = new SumPrizeDecorator(new MonthPrizeDecorator(component));

		double calcPrize = decorator.calcPrize("Tom", null, null);

		System.out.println("cal:" + calcPrize);

		Decorator decorator2 = new GroupPrizeDecorator(decorator);

		double calcPrize2 = decorator2.calcPrize("Mike", null, null);
		System.out.println("cal2:" + calcPrize2);

	}
}
