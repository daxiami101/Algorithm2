package designPattern.decorator02;

import java.util.Date;

public class ConcreteComponent extends Component{

	@Override
	public double calcPrize(String user, Date begin, Date end) {
		return 0;
	}

}
