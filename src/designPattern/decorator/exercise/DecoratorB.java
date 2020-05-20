package designPattern.decorator.exercise;

public class DecoratorB extends Decorator{

	public DecoratorB(Component component) {
		super(component);
	}
	
	@Override
	public void operation() {
		System.out.println("========B is doing=============");
		this.component.operation();
	}

}
