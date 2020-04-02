package designPattern.state.visitor;

public class Client {

	public static void main(String[] args) {
		
		ObjectStructure os=new ObjectStructure();
		
		Customer c1=new EnterpriseCustomer();
		c1.setName("ABC集团");
		os.addElement(c1);
		
		Customer c2=new PersonalCustomer();
		c2.setName("张三");
		os.addElement(c2);
		
		PredilectionAnalyzeRequestVisitor visitor=new PredilectionAnalyzeRequestVisitor();
		os.handleRequest(visitor);
	}
}
