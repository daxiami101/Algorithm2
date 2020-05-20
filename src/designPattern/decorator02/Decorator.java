package designPattern.decorator02;

import java.util.Date;

public abstract class Decorator extends Component {
	protected Component component;

	public Decorator(Component component) {
		super();
		this.component = component;
	}
	@Override
	public double calcPrize(String user, Date begin, Date end) {
		return component.calcPrize(user, begin, end);
	}
}
