package formula;

public class Item {
	private double weight=1.0;//权重
	private double value;//项值
	
	public Item(double weight, double value) {
		super();
		this.weight = weight;
		this.value = value;
	}
	public double getResult(){
		return weight*value;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
}
