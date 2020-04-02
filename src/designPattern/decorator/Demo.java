package designPattern.decorator;

public class Demo {
	public static void main(String[] args) {
		Component com=new Component();
		com.function();
		
		ComponentAdd add=new ComponentAdd(new Component());
		add.getComponent().function();
		add.functionAdditional();
	}

}
