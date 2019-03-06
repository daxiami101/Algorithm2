package formula;

public class Main {
	public static void main(String[] args) {
		Formula formula1=new Formula();
		formula1.getItems().add(new Item(0.1,2));
		formula1.getItems().add(new Item(0.2,3));
		formula1.setWeight(0.5);
		
		Formula formula2=new Formula();
		formula2.getItems().add(new Item(0.3,4));
		formula2.getItems().add(new Item(0.4,6));
		formula2.setWeight(0.5);
		
		Formula f=new Formula();
		f.addFormula(formula1).addFormula(formula2);
		System.out.println(f.formulaResult());
		
//		Class clazz=new Formula().getClass();
//		clazz.getMethod(name, parameterTypes)
	}
}
