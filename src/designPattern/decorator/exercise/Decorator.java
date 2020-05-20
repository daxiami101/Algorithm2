package designPattern.decorator.exercise;

public class Decorator extends Component {

	protected Component component;

	public Decorator(Component component) {
		super();
		this.component = component;
	}
	
}
