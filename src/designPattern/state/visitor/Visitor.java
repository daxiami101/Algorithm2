package designPattern.state.visitor;

public interface Visitor {

	public void visitEnterpriseCustomer(EnterpriseCustomer customer);
	public void visitPersonalCustomer(PersonalCustomer customer);
}
