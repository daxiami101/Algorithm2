package designPattern.state.visitor;

public class PredilectionAnalyzeRequestVisitor implements Visitor {

	@Override
	public void visitEnterpriseCustomer(EnterpriseCustomer customer) {
		System.out.println(customer.getName()+"---��ʼ����");
		
	}

	@Override
	public void visitPersonalCustomer(PersonalCustomer customer) {
		System.out.println(customer.getName()+"---��ʼ����");
	}

	
}
