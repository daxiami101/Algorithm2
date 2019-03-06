package generic;

public class ReflectPoint {
	private int a;
	private int b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public ReflectPoint(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public ReflectPoint() {
		super();
	}
	@Override
	public String toString() {
		return "ReflectPoint [a=" + a + ", b=" + b + "]";
	}
	
	

}
