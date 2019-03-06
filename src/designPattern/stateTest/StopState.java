package designPattern.stateTest;

public class StopState implements State{

	@Override
	public void doAction(Context context) {
		context.setState(this);
	}
	public void getState(){
		System.out.println("stop");
	}

}
