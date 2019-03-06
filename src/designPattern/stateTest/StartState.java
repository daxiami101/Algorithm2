package designPattern.stateTest;

public class StartState implements State{

	@Override
	public void doAction(Context context) {
		context.setState(this);
	}
	public void getState(){
		System.out.println("start");
	}
}
