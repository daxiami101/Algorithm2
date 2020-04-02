package designPattern.state.visitor;

public class PersonalCustomer extends Customer{

	@Override
	public void accept(Visitor visitor) {
		visitor.visitPersonalCustomer(this);
	}

}
