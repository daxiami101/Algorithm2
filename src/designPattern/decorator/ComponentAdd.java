package designPattern.decorator;

public class ComponentAdd implements Decorator{

	private Component component;
	
	
	public ComponentAdd(Component component) {
		super();
		this.component = component;
	}


	public Component getComponent() {
		return component;
	}


	
	@Override
	public void functionAdditional() {
		System.out.println("¸½¼Ó¹¦ÄÜ");
	}

}
