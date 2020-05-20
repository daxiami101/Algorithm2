package designPattern.decorator.exercise;

public class DecoratorA extends Decorator{

	public DecoratorA(Component component) {
		super(component);
	}
	
	@Override
	public void operation() {
		System.out.println("========A is doing=============");
		this.component.operation();
	}

}
