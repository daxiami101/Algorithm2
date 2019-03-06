package designPattern.stateTest;

public class Demo {
	public static void main(String[] args) {
		Context context=new Context();
		StartState start=new StartState();
		StopState stop=new StopState();
		
		start.doAction(context);
		start.getState();
		
		stop.doAction(context);
		stop.getState();
		
		
	}
}
