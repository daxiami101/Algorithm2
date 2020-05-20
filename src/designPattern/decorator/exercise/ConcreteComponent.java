package designPattern.decorator.exercise;

import java.util.concurrent.Callable;

public class ConcreteComponent extends Component implements MyListener, Callable<String> {

	@Override
	public void operation() {
		System.out.println("===========doing==============");
		update();
	}

	// public void addListener(MyListener listener){
	// listener.update();
	// }
	@Override
	public void update() {

	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
