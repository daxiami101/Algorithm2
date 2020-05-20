package designPattern.decorator.exercise;

public class Client {
	public static void main(String[] args) {
		Component component=new DecoratorA(new DecoratorB(new ConcreteComponent()));
		component.operation();
		
	}

}
