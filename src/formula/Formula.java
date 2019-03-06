package formula;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Formula {
	private Double weight;//权重
	private Double result;//计算结果
	private List<Item> items=new ArrayList<>();//多项式
	private List<Formula>formulas=new ArrayList<>();//子公式
	
	public Formula addFormula(Formula f){
		formulas.add(f);
		return this;
	}
	public Double formulaResult(){
		return formulas.stream()
				.map(m->m.getWeight()*m.calculate())
				.reduce((a,b)->a+b).get();
	}
	/**
	 * 
	 * zhangbin
	 * @return
	 * 2017年12月6日 下午2:46:12
	 * Double 多项式的计算结果
	 */
	public Double calculate(){
		Optional<Double> reduce = items.stream()
				 .map(m->m.getResult())//逐条计算多项式的计算结果
			     .reduce((a, b) -> a + b);
				return reduce.get();
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Double getResult() {
		return result;
	}
	public void setResult(Double result) {
		this.result = result;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public List<Formula> getFormulas() {
		return formulas;
	}
	public void setFormulas(List<Formula> formulas) {
		this.formulas = formulas;
	}
	public static void main(String[] args) {
		Item item1=new Item(0.5,2);
		Item item2=new Item(0.6,4);
		Formula formula=new Formula();
		formula.getItems().add(item1);
		formula.getItems().add(item2);
		System.out.println(formula.calculate());
	}
}
